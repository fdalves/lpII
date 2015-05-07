
public class Primo730813 {

	public static void main(String[] args) {
		
		
		int count = 0;
		long i = 2;
		while(true){
					
			if (primos(i)) count++;
			i++;
			if (count == 730813) break;
		}

		System.out.println(i);
	}

	
	
	
	public static boolean primos(long x){    
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
