package com.audiolibrary.classes;

public class Podcast extends Audio {

	public Podcast(String titulo, int duracao, double avaliacao) {
		super(titulo, duracao, avaliacao);
	}

	private Pessoa apresentador;
	
	private String assunto;	
	
	public Pessoa getApresentador() {
		return apresentador;
	}

	public void setApresentador(Pessoa apresentador) {
		this.apresentador = apresentador;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
}
