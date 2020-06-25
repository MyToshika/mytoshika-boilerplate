package com.mytoshika.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoRestController {

	@GetMapping(value="info")
	public String createNewUser() {

		return "You are welcome!";
	}

}
