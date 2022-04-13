package ex5repeticao;
import java.util.*;
public class ex5 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, resultado = 0;
		
		do {
			System.out.print("Digite um n�mero:");
			num = entrada.nextInt();
			resultado += num;
			}
		while(num != 0);
		System.out.println("A soma dos n�meros digitados �: " + resultado);
		entrada.close();
	}		
}
