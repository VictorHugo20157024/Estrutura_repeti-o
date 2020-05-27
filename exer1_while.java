import java.util.Scanner;

public class exer1_while {
	
	private static Scanner leitor;

	public static void main(String[] args) {
	
		
  leitor = new Scanner (System.in);
  
     int num, cont = 1;
     
     
     while (cont != 11) {
	System.out.printf(" Digite o %d numero : " , cont);
    num = leitor.nextInt();
    
    cont++;
    
    if (num > 0) {
    	System.out.println(" positivo");
    	
    }
    	
    	else { 
    		System.out.println(" negativo");
    		
    	}
    
     }
	
     
	}
}
    
	
	
     
    
     
    
	
	


