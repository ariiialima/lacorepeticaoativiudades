package ex1;

public class exrepeticao1 {
	/*
	 * 1- Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
	obtemos resto = 5. (FOR)
	 */

public static void main(String[] args) throws InterruptedException {
	
	for( int num = 1000; num <= 1999; num++) { 
			
		if (num % 11 == 5) {
			System.out.println(num);
			Thread.sleep(500);
		}
	}
}
}

