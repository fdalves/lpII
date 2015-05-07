import java.util.Scanner;


public class Exe3NumeroPerfeito {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite Numero: ");
		int numero = s.nextInt();
		
		int sumDiv =0;
		
		for(int i=1;i<=numero/2;i++) {   
		      
	        if((numero%i)==0) {  
	            sumDiv = i + sumDiv;   
	        }  
	    }
		
		
		if (sumDiv == numero){
			System.out.println(numero + " é um numero perfeito");
		} else {
			System.out.println(numero + " não é um numero perfeito");
		}
	}

}
