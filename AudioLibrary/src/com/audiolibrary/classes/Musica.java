package com.audiolibrary.classes;

public class Musica extends Audio {

	public Musica(String titulo, int duracao, double avaliacao) {
		super(titulo, duracao, avaliacao);
	}

	private Artista artista;
	
	private String genero;
	
	private String album;

	protected Artista getArtista() {
		return artista;
	}

	protected void setArtista(Artista artista) {
		this.artista = artista;
	}

	protected String getGenero() {
		return genero;
	}

	protected void setGenero(String genero) {
		this.genero = genero;
	}

	protected String getAlbum() {
		return album;
	}

	protected void setAlbum(String album) {
		this.album = album;
	}
}
