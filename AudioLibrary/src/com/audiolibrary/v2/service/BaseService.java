package com.audiolibrary.v2.service;

//E = Classe que irá representar uma Entidade
public interface BaseService<E extends Object> {

	public void save(E ent); 
}
