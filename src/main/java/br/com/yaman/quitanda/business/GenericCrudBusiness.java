package br.com.yaman.quitanda.business;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * 
 * @author marcus.martins
 *
 * @param <T>
 */
@Component
public interface GenericCrudBusiness<T> {	
	public  List<T> findAll() ;
	public  void save(T t) ;
	public  T findOne(Integer id) ;
	public  void delete(T t);
}
