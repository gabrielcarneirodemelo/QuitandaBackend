package br.com.yaman.quitanda.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.yaman.quitanda.dao.entity.Estoque;
import br.com.yaman.quitanda.service.EstoqueServiceImpl;

@Component
public class EstoqueBusiness implements GenericCrudBusiness<Estoque> {

	@Autowired
	private EstoqueServiceImpl service;

	@Override
	public List<Estoque> findAll() {
		return service.findAll();
	}

	@Override
	public void save(Estoque t) {
		service.save(t);
	}

	@Override
	public Estoque findOne(Integer id) {
		return service.findOne(id);
	}

	@Override
	public void delete(Estoque t) {
		service.delete(t);
	}

}