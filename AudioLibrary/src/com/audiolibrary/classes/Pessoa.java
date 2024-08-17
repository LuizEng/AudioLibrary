package com.audiolibrary.classes;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

	protected String nome;
	
	protected LocalDate dataNascimento;
		
	
	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected LocalDate getDataNascimento() {
		return dataNascimento;
	}

	protected void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	//Método para retornar a idade da pessoa
	protected int getIdade() {
		LocalDate dataAtual = LocalDate.now();
		
		Period periodo = this.dataNascimento.until(dataAtual);
		
		return periodo.getYears();
	}
}
