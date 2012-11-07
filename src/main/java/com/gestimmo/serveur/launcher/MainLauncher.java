package com.gestimmo.serveur.launcher;

import com.gestimmo.serveur.processes.HSQLDBUtil;
import com.gestimmo.serveur.processes.HTTPUtil;

public class MainLauncher {

	public static void main(final String[] args) throws Exception {
		new HTTPUtil(new Mainapplication(), 8081);
		new HSQLDBUtil("database", 8082);
	}
}
