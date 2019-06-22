package com.eventoapp.eventoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	
	//quando tiver uma requisicao vai retornar para a pagina index
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	

}
