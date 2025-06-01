package atividade7While;

import java.util.Scanner;

public class PotenciaBE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = sc.nextInt();

        System.out.println("Digite a exponent: ");
        int exponente = sc.nextInt();

        int resultado =1;
        int contagem  = 0;

        while (contagem < exponente) {
        	resultado = resultado * base;
            contagem++;
        }
        System.out.println(base+"^"+exponente+"="+resultado);
        
        sc.close();


	}
}
