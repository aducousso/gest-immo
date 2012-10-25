package com.gestimmo.serveur.http.launcher;

import com.gestimmo.serveur.http.processes.HSQLDBUtil;
import com.gestimmo.serveur.http.processes.HTTPUtil;

public class MainLauncher {

	public static void main(final String[] args) throws Exception {
		new HTTPUtil(new Mainapplication(), 8081);
		new HSQLDBUtil("database-cvtheque", 8082);
	}
}
