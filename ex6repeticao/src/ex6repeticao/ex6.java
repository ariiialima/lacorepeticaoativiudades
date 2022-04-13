package ex6repeticao;
import java.util.*;
public class ex6 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i = 0, num = 0, soma = 0;
		double media = 0.0;
		
		do {
			System.out.println("Escreva um numero: ");
			num = entrada.nextInt();
			
			if(num % 3 == 0 && num != 0) {
				soma = soma + num;
				i++;
				}
			}
			while( num != 0);
			media = soma / i;
			System.out.println("Impressao da Media: " + media);
			entrada.close();
	}
			
}

