package com.audiolibrary.v2.service;

//E = Classe que irá representar uma Entidade
public abstract class BaseServiceImpl<E> implements BaseService<E> {

	//Futuramente, esse método será responsável por salvar os itens no banco de dados
	@Override
	public void save(E ent) {
		
	}

}
