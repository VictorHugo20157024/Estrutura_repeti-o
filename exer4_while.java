import java.util.Scanner;

public class exer4_while {

	public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
	
	
    int num, cont = 1, m = 0;
    
    
    while (cont < 15) {
    	System.out.printf(" Digite o %d numero : " , cont);
    	num = leitor.nextInt();
    	cont ++;
    	
    	if ( num < m) {
    	m = num;
    
    	}
    }
    
    System.out.println(" o maior numero digitado foi o =" +m);

    
	}
	
}

