import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		
		try (Scanner leitor = new Scanner(System.in)) {
			int a =  1;
			System.out.println("Digite um numero");
			int num = leitor.nextInt();
			
			while (a <= num); {
			
			System.out.println(a);
			a++;
			
			}
		}
		
		
	}
	
		
}