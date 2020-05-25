import java.util.Scanner;

public class exer3 {
	
	public static void main(String[] args) {
	
	
	int i,  num = 0 , soma = 0;
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.println( " digite 20 numeros seguidos ");
	
	  for  (i = 0 ; i < 20; i++) {
		  System.out.print("Digite um numero");
		  
		  num = leitor.nextInt();
		  
		soma= soma+num;
	  }
	  
	  System.out.println("Soma dos 20 numeros" + soma);
	  System.out.println(" Media dos 20 numeros"+(soma/20));
	  
		}
}


	  
		
				
		  
	
	
	
	
	
	
	


