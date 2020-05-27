import java.util.Scanner;

public class exer5_while {

	public static void main(String[] args) {
		
		try (Scanner leitor = new Scanner( System.in)) {
			int cont = 0;
			float cont1 = 1, medSal = 0, alt = 0, altMax = 0, altMin = 3, sal = 0;
			String sx = null;
			
			while (cont1 <= 3) {
				System.out.println(" digite a altura do funcionario");
				alt = leitor.nextFloat();
				
				System.out.println(" digite o salario do funcuinario");
				sal = leitor.nextFloat();
				
				System.out.println(" digite o sexo do funcuinario");
				sx = leitor.nextLine();
				
				System.out.println();
				cont1++;
				
				medSal += sal;
				
			if ( alt > altMax);
				altMax = alt;
				
				}
			
			if ( alt < altMin);  {
			   altMin = alt;
			   
			 }
			
			if (sx.equals("f") && sal <= 1000) {
				cont1++;
				System.out.println(cont1);
				
				}
			
			
			System.out.println("  a media do salario do grupo e: R$" +medSal /3);
			System.out.println(altMax+ " e a maior altura e a menor é " +altMin);
			System.out.printf(" há %f mulheres que recebe, ate 1000,00. " , cont1);
		}
		
		
	}
}
