import java.util.Scanner;

public class exer5 {
	
	 private static Scanner leitor;
	private static String sexo;
	private static Object sexo2;

	public static void main(String[] args) {
		 
		 double cont1000 = 0;
		 
		 double salario = 1, altura;
		 double media, soma = 0 , maior = 0 , menor = 200;
		 int Contagem = 1;
		 
		 leitor = new Scanner(System.in);
		 
		 do {
			 
			 System.out.println("Digite qual é o seu sexo (M/F) , contagem");
			 sexo2 = leitor.hasNext();
			 
			 int contagem = 0;
			System.out.printf(" Digite seu salario",contagem);
			 salario = leitor.nextDouble();
			 
			 
			 System.out.printf(" Digite sua altura",contagem);
			 altura = leitor.nextDouble();
			 Contagem++; 
			 
			 soma = soma+salario;
			 media = soma/20;
			 
			 if (altura > maior) {
				 maior = altura;
			 }
			 
			 if (altura < menor) {
				 menor = altura;
		}
			 
			 sexo2 = null;
				 
	      	 }
			 		 
		 
		 
		 
		 while( Contagem < 5);
		 
		 System.out.println( "media dos salarios e de :" +media);
		 System.out.println( " maior altura : " +maior+ " menor altura : " + menor);
		 System.out.println(" quantidade de mulheres com salario ate 1000,00 e de :" +cont1000);
		 
		 }
		 
	 }
		 
		 
		  
	 

	 

