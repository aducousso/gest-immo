package com.gestimmo.serveur.http.launcher;

import com.gestimmo.serveur.http.resources.*;
import freemarker.template.Configuration;
import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.resource.Directory;
import org.restlet.routing.Router;

import java.io.File;

public class Mainapplication extends Application {

	@Override
	public synchronized void start() throws Exception {
		super.start();
		final Configuration configuration = new Configuration();
		configuration.setClassForTemplateLoading(getClass(), "/webPages");
		getContext().getAttributes().put("org.freemarker.Configuration",
				configuration);
	}

	@Override
	public synchronized Restlet createInboundRoot() {
		final Router router = new Router(getContext());

		attachRessources(router);

		router.attachDefault(DefaultResource.class);

		//hibernateHandling(router, "/connex", ConnexionRessource.class);

		return router;
	}

	private void hibernateHandling(final Router router, final String urlMapped, final Class laClasseAttachee) {

		final HandlerHibernate hibernateHandler = new HandlerHibernate(
				getContext());

		hibernateHandler.setNext(laClasseAttachee);

		router.attach(urlMapped, hibernateHandler);
	}

	private void attachRessources(final Router router) {
		final String tousLesFichiers[] = new File("src/main/resources/webResources/").list();

        if (tousLesFichiers != null) {
            for (final String unFichier : tousLesFichiers) {
                System.out.println(unFichier);
                router.attach("/resources/" + unFichier, new Directory(getContext(),
                        "clap://system/webResources/" + unFichier));
            }
        }
	}
}