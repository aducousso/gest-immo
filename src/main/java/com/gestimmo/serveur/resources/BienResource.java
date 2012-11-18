package com.gestimmo.serveur.resources;

import java.util.List;

import com.gestimmo.metier.dao.BienDAO;
import com.gestimmo.serveur.processes.TemplateRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.*;

public class BienResource extends ServerResource {
	private BienDAO bienDao = new BienDAO();
	private List<?> biens;
	
	@Get
	public Representation represente() {
		String title = "Page des biens !!!";
		
		biens = bienDao.getListe();
		
		return TemplateRepresentation.createNew("biens.ftl", getContext()).with("pageTitle", title).with("biens", biens);
	}
}
