/*
 * InicioDeJogo.java
 * 
 * 
 *  24 - 15 - 2 = 11
 * 
 */

import java.util.Scanner;

public class InicioDeJogo {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int inicio  = 0;
		int fim     = 0;
		int duracao = 0;
		
		System.out.print("Digite a hora de inicio do jogo: ");
		inicio = entrada.nextInt();
		
		System.out.print("Digite a hora do fim do jogo: ");
		fim = entrada.nextInt();
		
		if (inicio > fim){
			duracao = (fim - (inicio - 24));
			System.out.print("A duracao do jogo foi de: "+duracao+"h");
		}else{
			duracao = (inicio - fim) * (-1);
			System.out.print("A duracao do jogo foi de: "+duracao+"h");
		}	
		
	}
}

