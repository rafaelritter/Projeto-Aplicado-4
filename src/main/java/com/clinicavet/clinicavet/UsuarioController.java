package com.clinicavet.clinicavet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioRepository ur;

	@RequestMapping(value = "/cadastrarUsuario", method = RequestMethod.GET)
	public String form() {
		return "cadastrarUsuario";
	}

	@RequestMapping(value = "/cadastrarUsuario", method = RequestMethod.POST)
	public String form(Usuario usuario) {

		ur.save(usuario);
		return "redirect:/cadastrarUsuario";
	}

}
