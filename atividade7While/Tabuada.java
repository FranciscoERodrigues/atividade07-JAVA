package atividade7While;
import java.util.Scanner;


public class Tabuada {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				System.out.println("CALCULADORA 2025 ");
				System.out.println("Digite um numero: ");
				int numero = sc.nextInt();
				int contadora = 1;
				
				while(contadora <= 10) {
					
					System.out.println(numero+"x"+contadora +"="+(numero*contadora));
					++contadora;
					
					sc.close();
				}
			
			}

	}
