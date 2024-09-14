package com.audiolibrary.v2.dto;

import java.time.LocalDate;

public class PessoaDto {
	protected String nome;
	
	protected LocalDate dataNascimento;
		
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
