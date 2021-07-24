package com.familia28.familia28.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")


public class HalloController {

	@GetMapping("/hello1")
	public String hello() {
		return "Hoje eu usei muito a pesistencia pois tive que procurar por uma hora o erro que estava dando e a força de vontade tambem";


	}
	@GetMapping("/hello2")
	public String hello2() {
		return "Nessa semana quero aumentar minhas habilidades nessa tecnologia";

	}
	
}
