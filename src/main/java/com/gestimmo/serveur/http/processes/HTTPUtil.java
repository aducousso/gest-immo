package com.gestimmo.serveur.http.processes;

import org.restlet.Application;
import org.restlet.Component;
import org.restlet.data.Protocol;

public class HTTPUtil extends Component {

	public HTTPUtil(final Application applicationAttachee, final Integer port) {
		try {
			getServers().add(Protocol.HTTP, port);
			getClients().add(Protocol.CLAP);
			getDefaultHost().attachDefault(applicationAttachee);
			start();
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
