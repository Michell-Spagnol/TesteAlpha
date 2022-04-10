/*  5.5 Construir um programa que leia um String e mostre separadamente:
			a) as letras e quantas são 
			b) os números e quantos são 
		x	c) quantidade de espaços
		*/

package teste;

import java.util.Scanner;

public class Qst_55 {

public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		String frase1 ;

		System.out.println("Escreva uma frase: ");
		
		frase1 = teclado.nextLine();
		//frase1 = " 333 tigres tristes e 33 tigressas tristes com 3 tigrinhos"; //n= 6 l= 42 e= 10
		
		
		// numeros e letras
		int contNum = 0;
		int contLetra = 0;
		int espaco = 0;
		String numeros = new String(); 
		String letras = new String();
		 
		for (int i = 0; i < frase1.length(); i++) {
			
		    char c = frase1.charAt(i);
		    
		    if (Character.isDigit(c)) {
		    	contNum++;
		    	numeros += c;
		    	
		    }else if (Character.isLetter(c)) {
		        contLetra++;
		        letras += c;
		        
		    }else if (Character.isSpaceChar(c)) {
                espaco++;
		}
		    }

		System.out.println("\na) Tal String possui " + contLetra + " letras\n" + letras);
		System.out.println("\nb) Tal String possui " + contNum + " numeros\n" + numeros);
		System.out.println("\nc) Tal String possui " + espaco + " espaços.");
		
		
		
		teclado.close();

	}

}
