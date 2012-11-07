package com.gestimmo.serveur.http.processes;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

    private static HibernateUtil instance = null;
    private static SessionFactory sessionFactory = null;

    private static Integer portNumber;
    private static String dbName;

    public static HibernateUtil getInstance() {
        if (instance == null) {
            instance = new HibernateUtil();
        }

        return instance;
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = buildSessionFactory();
        }
        return sessionFactory;
    }

    private static SessionFactory buildSessionFactory() {
        try {
            final Configuration config = new Configuration();
            config.configure("hibernate.cfg.xml");
            config.setProperty("hibernate.connection.url",
                    "jdbc:hsqldb:hsql://localhost:" + portNumber + "/" + dbName);

            final ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
                    .applySettings(config.getProperties())
                    .buildServiceRegistry();

            return config.buildSessionFactory(serviceRegistry);

        } catch (final Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public void setPort(final Integer port) {
        portNumber = port;
    }

    public void setDbName(final String db) {
        dbName = db;
    }
}