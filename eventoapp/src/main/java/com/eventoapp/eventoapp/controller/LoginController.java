package com.eventoapp.eventoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {
	@RequestMapping("/login")
	public String form() {
		return "login/login"; //nome do diretório onde se encontra aqui no eclipse
	}
}



