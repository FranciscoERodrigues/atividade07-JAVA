package atividade7While;

public class Expoente {

	public static void main(String[] args) {
	
	        int expoente = 0;

	        while (expoente <= 15) {
	            int resultado = 1;
	            int i = 0;
	            while (i < expoente) {
	                resultado *= 3;
	                i++;
	            }
	            System.out.println("3^" + expoente + " = " + resultado);
	            expoente++;

	        }
	}
}


