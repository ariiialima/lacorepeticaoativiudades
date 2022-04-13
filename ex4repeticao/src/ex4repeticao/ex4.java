package ex4repeticao;
import java.util.*;
public class ex4 {


public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	int pessoas=0, idade=0, sexo=0, persona=0, c = 0, n = 0, a = 0;
	int ferminino = 1, masculino = 2, outros = 3;
	int calmos = 1, nervosas = 2, agressivo = 3;

	while (pessoas<= 5) {

		
		System.out.println("informe sua idade:");
		idade = entrada.nextInt();
		System.out.println("De 1 � 3 informe seu sexo sendo 1ferminino,2masculino ou 3outros?");
		sexo = entrada.nextInt();
		System.out.println("Sua personalidade � de 1 � 3 sendo 1calma, 2 nervosa ou 3 agressivo?");
		persona = entrada.nextInt();

		if (calmos == c) {
			c++;
			System.out.println("total de pessoas calmas:" + persona);
		}

		else if(sexo == calmos) {
			sexo = ferminino+ c;
			System.out.println("quantidade de mulheres calmas" + sexo);
			sexo++;

		}

		else if (sexo == agressivo) {
			sexo = masculino + a;
			System.out.println("quantidade de homens agressivos" + sexo);
			sexo++;
		}

		else if (sexo == calmos) {
			sexo = outros + c;
			System.out.println("Quantidade de outros calmos" + sexo);
			sexo++;
		}

		else if (idade == nervosas && idade > 40) {
			idade = nervosas + n;
			System.out.println("Quantidade de pessoas com mais de 40 anos agressivas" + idade);
			idade++;

		} else if (idade== calmos && idade < 18) {
			idade = calmos+ c;
			System.out.println("Quantidade de pessoas com menos de 18 anos calmas" + idade);
			idade++;
		}
			
	}

}




