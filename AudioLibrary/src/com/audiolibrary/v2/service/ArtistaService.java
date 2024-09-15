package com.audiolibrary.v2.service;

import com.audiolibrary.classes.Artista;
import com.audiolibrary.v2.converter.ArtistaConverter;
import com.audiolibrary.v2.dto.ArtistaDto;

public class ArtistaService extends BaseServiceImpl<Artista>{
	
	private ArtistaConverter artistaConverter;

	//Método responsável por pegar os dados de uma camada de DTO e converter para entidade
	//TODO - Criar camada de conversão e abstrair em BaseService
	public Artista criarArtista(ArtistaDto dto) {				
		Artista artista = new Artista();
		//TODO - Magicamente a implementação do converter substituindo o bloco anterior
		artistaConverter = new ArtistaConverter();
		artistaConverter.toEnt(dto, artista);
		
		super.save(artista);
		return artista;
	}
}
