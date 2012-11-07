package com.gestimmo.serveur.http.resources;

import com.gestimmo.metier.dao.exceptions.DataException;
import com.gestimmo.serveur.http.processes.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.routing.Filter;

public class HandlerHibernate extends Filter {

    Session session;
    Transaction transactionEncours;

    public HandlerHibernate(final Context context) {
        super(context);
    }

    @Override
    protected int beforeHandle(final Request request, final Response response) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        transactionEncours = session.beginTransaction();

        return CONTINUE;
    }

    @Override
    protected void afterHandle(final Request request, final Response response) {
        try {
            transactionEncours.commit();
        } catch (final DataException e) {
            System.out.println(e);
            transactionEncours.rollback();
        }
    }
}