package com.audiolibrary.v2.converter;

public abstract class BaseConverterImpl<E, D> implements BaseConverter<E, D> {
	
	@Override
	public E toEnt(D dto, E ent) {
		castClass(dto, ent);
		
		return ent;
	}
	
	@Override
	public D toDto(E ent, D dto) {
		castClass(ent, dto);
		return dto;
	}
	
	//TODO - Método que fará a atribuição automática entre as classes
	private void castClass(Object input, Object output) {
		
	}
}
