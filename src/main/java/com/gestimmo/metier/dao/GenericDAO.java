package com.gestimmo.metier.dao;

import com.gestimmo.metier.dao.exceptions.DataException;
import com.gestimmo.serveur.http.processes.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class GenericDAO {
	private final Session session;

	public GenericDAO() {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
	}

	public Session getSession() {
		return session;
	}

	public void saveOrUpdate(final Object objetConcernee) throws DataException {
		try {
			session.saveOrUpdate(objetConcernee);
		} catch (final HibernateException e) {
			throwException(e);
		}
	}

	public void delete(final Object objetConcernee) throws DataException {
		try {
			session.delete(objetConcernee);
		} catch (final HibernateException e) {
			throwException(e);
		}
	}

	public Object find(final Class<?> clazz, final Integer objetId) throws DataException {
		Object obj = null;

		try {
			obj = session.load(clazz, objetId);
		} catch (final HibernateException e) {
			throwException(e);
		}

		return obj;
	}

	public List findAll(final String tableName) throws DataException {
		List objects = null;

		try {
			final Query query = session.createQuery("from " + tableName);
			objects = query.list();
		} catch (final HibernateException e) {
			throwException(e);
		}

		return objects;
	}

	public void throwException(final HibernateException e) throws DataException {
		throw new DataException(e);
	}
}