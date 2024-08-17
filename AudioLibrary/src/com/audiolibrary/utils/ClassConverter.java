package com.audiolibrary.utils;

import java.lang.reflect.Field;

public class ClassConverter {

	/* Essa classe é uma loucura, mas apenas converte um objeto genérico (<T>)
	 * e imprime as propriedades dela em uma string
	 */
	//Declaro um método que irá retornar uma string e receber qualquer coisa(T)
	public <T> String classToString(T obj) {
		//Crio uma instância da classe StringBuilder
		StringBuilder result = new StringBuilder();

		//Obtenho a classe do que foi informado no parâmetro do método
        Class<?> classe = obj.getClass();
        
        
        //Pego todos os campos da classe, inclusive "private"
        Field[] fields = classe.getDeclaredFields();

        //Itero sobre os campos da classe para montar a string
        for (Field field : fields) {
        	//Torno o campo acessível, para o caso dos campos privados
            field.setAccessible(true); 
            try {
            	//Adiciono o valor do nome campo e o valor na string. 
            	//Encerro ela com quebra de linha 
                result.append(field.getName()).append(": ").append(field.get(obj)).append("\n");
            } catch (IllegalAccessException e) {
            	//uma exceção genérica, caso algo de errado
                e.printStackTrace();
            }
        }

        return result.toString();		
	}
}
