package com.audiolibrary.classes;

public class Audio {

	private String titulo;
	
	//TODO transformar em LocalTime
	private int duracao;
	
	private Long quantidadeReproducoes;
	
	private Long quantidadeCurtidas;
	
	private double avaliacao;	
	
	//Construtor completo
	public Audio(String titulo, int duracao, Long quantidadeReproducoes, Long quantidadeCurtidas, double avaliacao) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.quantidadeReproducoes = quantidadeReproducoes;
		this.quantidadeCurtidas = quantidadeCurtidas;
		this.avaliacao = avaliacao;
	}
	
	//Construtor sem as Curtidas e Reproduções
	public Audio(String titulo, int duracao, double avaliacao) {
		//Apenas chamo o construtor "completo", informado 0 curtidas e reproduções
		this(titulo, duracao, 0L, 0L, avaliacao);
	}
		
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public Long getQuantidadeReproducoes() {
		return quantidadeReproducoes;
	}

	public void setQuantidadeReproducoes(Long quantidadeReproducoes) {
		this.quantidadeReproducoes++;
	}

	public Long getQuantidadeCurtidas() {
		return quantidadeCurtidas;
	}

	public void setQuantidadeCurtidas(Long quantidadeCurtidas) {
		this.quantidadeCurtidas++;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}

	


}
