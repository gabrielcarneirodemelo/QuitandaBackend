package br.com.yaman.quitanda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.yaman.quitanda.business.EstoqueBusiness;
import br.com.yaman.quitanda.business.GenericCrudBusiness;
import br.com.yaman.quitanda.dao.entity.Estoque;

@RestController
@RequestMapping(value = "estoque")
public class EstoqueController extends CrudControllerBase<Estoque> {
	
	@Autowired
	private EstoqueBusiness business;

	@Override
	public GenericCrudBusiness<Estoque> getBusinessClass() {		
		return business;
	}

}
