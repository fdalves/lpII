import java.util.Scanner;


public class Exe6QuebraDeLinha {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String nome = s.nextLine();
		
		
		System.out.println("Digite Numero colunas: ");
		int numero = s.nextInt();
		
		
		String [] palavras = nome.split("\n");
		
		for (String string : palavras) {
			System.out.println();
		}
	}
	
	

}
