package atividade7While;
import java.util.Scanner;

public class Positivo {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int num;
	        int maior = Integer.MIN_VALUE;
	        int menor = Integer.MAX_VALUE;

	        while (true) {
	            System.out.print("Digite um número positivo (negativo para sair): ");
	            num = sc.nextInt();

	            if (num < 0) {
	                break;
	            }

	            if (num > maior) maior = num;
	            if (num < menor) menor = num;
	        }

	        if (maior == Integer.MIN_VALUE) {
	            System.out.println("Nenhum número válido foi digitado.");
	        } else {
	            System.out.println("Maior número: " + maior);
	            System.out.println("Menor número: " + menor);
	        }

	        sc.close();

	}

}
