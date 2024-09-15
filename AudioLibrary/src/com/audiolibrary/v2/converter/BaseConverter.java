package com.audiolibrary.v2.converter;

public interface BaseConverter<E extends Object, D extends Object> {
	
   E toEnt(D dto, E ent);
   
   D toDto(E ent, D dto);


}
