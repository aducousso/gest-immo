package com.gestimmo.serveur.http.processes;

import org.hsqldb.Server;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class HSQLDBUtil extends Server {
	public HSQLDBUtil(final String dbname, final Integer port) {
		try {
			setLogWriter(new PrintWriter(new FileOutputStream(
					"hsqldb/hsqldb.log")));
			setDatabaseName(0, dbname);
			setDatabasePath(0, "file:hsqldb/" + dbname);
			setPort(port);
			start();

			HibernateUtil.getInstance().setPort(port);
			HibernateUtil.getInstance().setDbName(dbname);

			Class.forName("org.hsqldb.jdbcDriver");
		} catch (final FileNotFoundException e) {
			System.out.println("Le fichier de log n'a pas été trouvé.");
		} catch (final ClassNotFoundException e1) {
			System.out.println("Pilote HSQLDB introuvable.");
		}
	}
}
