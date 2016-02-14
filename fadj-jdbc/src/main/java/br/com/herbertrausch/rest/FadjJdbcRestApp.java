package br.com.herbertrausch.rest;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Application;

public class FadjJdbcRestApp extends Application {


	@Override
	public Map<String, Object> getProperties() {
		Map<String, Object> properties = new HashMap<>();
		// Configura o pacote para fazer scan das classes com anotações REST.
		properties
				.put("jersey.config.server.provider.packages", "br.com.livro");
		return properties;
	}
}