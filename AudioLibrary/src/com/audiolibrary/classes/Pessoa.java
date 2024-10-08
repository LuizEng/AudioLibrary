package com.audiolibrary.classes;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

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


	//Método para retornar a idade da pessoa
	protected int getIdade() {
		LocalDate dataAtual = LocalDate.now();
		
		Period periodo = this.dataNascimento.until(dataAtual);
		
		return periodo.getYears();
	}
}
