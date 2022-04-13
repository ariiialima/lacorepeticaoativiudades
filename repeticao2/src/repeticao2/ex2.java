package repeticao2;
import java.util.*;
public class ex2 {
	//2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
	
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			int n = 0;
			int par = 0, impar = 0;
			
			for(int num = 1; num <= 10; num++) {
				System.out.print("Entre com um n�mero: ");
				n = entrada.nextInt();
				
			if(n % 2 == 0) {
				++par;
			}
			else { 
				impar++;
			}
			}
			System.out.println("A quantidade de n�mero pares �: " + par);
			System.out.println("A quantidade de n�meros impares �: " + impar);
			
			entrada.close();
		}
	}

