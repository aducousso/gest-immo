package com.gestimmo.metier.dao;

import org.hibernate.Session;
import org.hibernate.exception.DataException;

import java.util.List;

public class BienDAO {
	private GenericDAO genDao; 
	private final Session session;
	
	public BienDAO() {
		genDao = new GenericDAO();
		session = genDao.getSession();
	}
	
	public List<?> getListe() throws DataException {
		try {
			final List<?> biens = session.createSQLQuery(
					"SELECT * FROM bien").list();
			return biens;
			
		} catch (final DataException e) {
			throw (e);
		}
	}	
	
}