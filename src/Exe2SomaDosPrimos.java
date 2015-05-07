import java.util.Scanner;


public class Exe2SomaDosPrimos {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Digite Numero: ");
		
		int numero = s.nextInt();
		
		StringBuffer sb = new StringBuffer();
		int sumPrimos = 0;
		
		for (int i = 0; i < numero; i++) {
			
			if(primos(i)){
				
				if (sb.toString().equals("")){
					sb.append (i);
				} else {
					sb.append(" + "+ i);
				}
				
				sumPrimos = i + sumPrimos;
			}
		}
		
		System.out.println("A soma dos primos menores que "+ numero + " é " + sb.toString() + " = " + sumPrimos);
	}
	
	
	
	
	public static boolean primos(int x){    
	    if (x == 1 || x==0){ 
	        return false;  
	    }  
	  
	    for(int i=2;i<=x/2;i++) {   
	      
	        if((x%i)==0) {  
	            return false;   
	        }  
	    }  
	    return true;   
	}    
}
