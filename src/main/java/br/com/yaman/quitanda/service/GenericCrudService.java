package br.com.yaman.quitanda.service;

import java.util.List;

import br.com.yaman.quitanda.dao.entity.Produto;

public interface GenericCrudService<T> {

	
	public List<T> findAll();
	public void save(T t);
	public T findOne(Integer id);
	public void delete(T t);
	
	
}
