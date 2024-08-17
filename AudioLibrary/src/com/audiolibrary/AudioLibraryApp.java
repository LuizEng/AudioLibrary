package com.audiolibrary;

import com.audiolibrary.classes.Audio;
import com.audiolibrary.utils.ClassConverter;

public class AudioLibraryApp {

    public static void main(String[] args) {
    	System.out.println("Bem-vindE ao audio library\n");
    	
    	//Apenas pra testar a classe de conversão
    	
    	/*Crio uma instância da classe áudio, alimentando os dados
    	  no construtor
    	*/
    	Audio audio = new Audio("Título teste", 3, 850000L, 100000L, 5.9);
    	
    	//Crio uma instância de ClassConverter
    	ClassConverter converter = new ClassConverter();
    	
    	//Executo o método classToString da classe ClassConverter
    	String retorno = converter.classToString(audio);
    	
    	/*Imprimo o retorno utilizando o String.format
    	 *  \n é a quebra de linha
    	 *   %s indica que um valor do tipo string será informado para substituição
    	 */
    	System.out.println(String.format("Audio:\n%s", retorno));
    	
    }
}
