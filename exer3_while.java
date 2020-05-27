import java.util.Scanner;

public class exer3_while {
	
	public static void main(String[] args) {
	
		
	Scanner leitor = new Scanner(System.in);
	
	int num, soma = 0, media = 0 , rep =1;
	
	System.out.println("Digie 20 numeros: \n ");
	
	
	while (rep <= 20) {
		System.out.printf(" %dN :" , rep);
		num = leitor.nextInt();
		++rep;
		
		soma = soma + num;
		media = soma/20;
		
	}
	
	System.out.println();
	System.out.println(" Soma : / n" +soma);
	System.out.println(" media :" +media);
	
		}

}
