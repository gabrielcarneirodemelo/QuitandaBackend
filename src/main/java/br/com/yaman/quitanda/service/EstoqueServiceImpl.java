package br.com.yaman.quitanda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.yaman.quitanda.dao.entity.Estoque;
import br.com.yaman.quitanda.repository.EstoqueRepository;

@Service
public class EstoqueServiceImpl implements GenericCrudService<Estoque> {

	@Autowired
	private EstoqueRepository repository;

	@Override
	public List<Estoque> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(Estoque t) {
		repository.save(t);
	}

	@Override
	public Estoque findOne(Integer id) {
		return repository.findOne(id);
	}

	@Override
	public void delete(Estoque t) {
		repository.delete(t);
	}
	

}
