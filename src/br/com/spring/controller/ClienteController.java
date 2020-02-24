package br.com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.spring.dao.ClienteDao;
import br.com.spring.model.Cliente;

@Controller
public class ClienteController {

	@Autowired
	private ClienteDao clienteDao;
	
	@RequestMapping("formCadastroCliente")
	public String formCadastroCliente() {
		return "formCadastroCliente";
	}
	
	@RequestMapping("cadastroCliente")
	public String cadastroCliente(Cliente c) {
		
		if (c.getId() == null) {
			clienteDao.inserir(c);
		} else {
			//clienteDao.atualiza(c);
		}
		
		return "redirect:formCadastroCliente";
	}
	
}
