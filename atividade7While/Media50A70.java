package atividade7While;

public class Media50A70 {

	public static void main(String[] args) {
		

	 int i = 50, soma = 0, contador = 0;
	
	        while (i <= 70) {
	            if (i % 2 == 0) {
	                soma += i;
	                contador++;
	            }
	            i++;
	        }
	
	        double media = soma / (double) contador;
	        System.out.println("Soma dos pares: " + soma);
	        System.out.println("Média dos pares: " + media);

}

}