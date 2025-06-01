package atividade7While;

import java.util.Scanner;

public class Media10 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int contador = 0, soma = 0;

	        while (contador < 10) {
	            System.out.print("Digite um número: ");
	            int numero = sc.nextInt();
	            soma += numero;
	            contador++;
	        }

	        double media = soma / 10.0;
	        System.out.println("Soma = " + soma);
	        System.out.println("Média = " + media);

	        sc.close();

	}

}
