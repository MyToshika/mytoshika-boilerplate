package com.mytoshika.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoRestController {
	
	@Value("${config.server.url}")
	private String configServer;
	
	@Value("${registery.server.url}")
	private String registryServer;

	@GetMapping(value="info")
	public String createNewUser() {

		return "You are welcome!";
	}

	@GetMapping(value="getConfigHost")
	public String getConfigHost() {

		return "Config Server Host:: "+configServer;
	}
	
	@GetMapping(value="getRegistryServerHost")
	public String getRegistryServerHost() {

		return "Registry Server Host:: "+registryServer;
	}
}
