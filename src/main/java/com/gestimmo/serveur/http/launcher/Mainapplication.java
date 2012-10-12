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

		//router.attachDefault(DefaultResource.class);

		//hibernateHandling(router, "/connex", ConnexionRessource.class);

		return router;
	}

	private void hibernateHandling(final Router router, final String urlMapped,
			final Class<?> clazz) {

		final HandlerHibernate hibernateHandler = new HandlerHibernate(
				getContext());

		hibernateHandler.setNext(clazz);
		router.attach(urlMapped, hibernateHandler);
	}

	private void attachRessources(final Router router) {
		final File dir = new File("src/main/resources/webResources/");
		final String files[] = dir.list();

		for (final String t : files) {
			router.attach("/resources/" + t, new Directory(getContext(),
					"clap://system/webResources/" + t));
		}
	}
}