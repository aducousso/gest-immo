package com.gestimmo.serveur.http.resources;

import com.gestimmo.serveur.http.processes.TemplateRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import java.io.File;

public class DefaultResource extends ServerResource {

    @Get
    public Representation reprente() {
        String file;
        String title;
        final String pageReference = getReference().getRemainingPart().substring(1);

        if (new File("src/main/resources/webPages/statique/" + pageReference + ".ftl").exists()) {
            file = "statique/" + pageReference;
            title = pageReference.substring(0, 1).toUpperCase()
                    + pageReference.substring(1).toLowerCase();
        } else {
            file = "index";
            title = "Accueil";
        }

        return TemplateRepresentation.createNew(file + ".ftl", getContext()).with("pageTitle", title);
    }
}
