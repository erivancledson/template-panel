package com.template.teste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	@GetMapping("/listar")
	public String listar() {
		return "cliente/listar";
	}
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "cliente/cadastrar";
	}
}
