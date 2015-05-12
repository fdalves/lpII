import java.util.Scanner;

public class Exe33PadroesNumero {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Digite Numero: ");

		int numero = s.nextInt();

		int col = numero + (numero - 1);
		int lin = col;

		int[][] mat = new int[col][lin];

		for (int x = 0; x < numero; x++) {

			if (x == 0) {
				for (int i = 0; i < mat.length; i++) {
					for (int j = 0; j < mat.length; j++) {
						mat[i][j] = numero;
					}
				}
			}
			
			
			
			else if (x > 0){	
				for (int i = 0; i < mat.length; i++) {
					if (i < x) continue;
					for (int j = 0; j < mat[i].length; j++) {
						 if (j < x ) continue; 
						 if (j < (mat.length -x ))
						 mat[i][j] = numero - x;
		
					}
				}
			}
			
			
		}

		
		
		
		for(int i = 0; i < mat.length; i++)   {  
			if (i ==  numero) break;
            for(int j = 0; j < mat[i].length; j++)    {  
                System.out.print(mat[i][j]);  
            }  
            System.out.println(""); 
            
        }  
		
		
		for(int i = numero -2; i >= 0; i--)   {  
			
            for(int j = 0; j < mat[i].length; j++)    {  
                System.out.print(mat[i][j]);  
            }  
            System.out.println(""); 
            
        }  
		
		
		
		
		
	
		System.out.println("------------");
		

		
		
		
		
		
	}

}
