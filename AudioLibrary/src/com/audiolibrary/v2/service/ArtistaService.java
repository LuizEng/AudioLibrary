package com.audiolibrary.v2.service;

import com.audiolibrary.classes.Artista;
import com.audiolibrary.v2.dto.ArtistaDto;

public class ArtistaService extends BaseServiceImpl<Artista>{

	//Método responsável por pegar os dados de uma camada de DTO e converter para entidade
	//TODO - Criar camada de conversão e abstrair em BaseService
	public Artista criarArtista(ArtistaDto dto) {		
		Artista artista = new Artista();
		artista.setNome(dto.getNome());
		artista.setNomeArtistico(dto.getNomeArtistico());
		artista.setDataNascimento(dto.getDataNascimento());
		super.save(artista);
		return artista;
	}
}
