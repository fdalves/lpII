import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Exe6QuebraDeLinha {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String nome = s.nextLine();
		
		
		System.out.println("Digite Numero colunas: ");
		int numero = s.nextInt();
		
		nome = nome.replaceAll(" ",";");
		String [] palavras = nome.split(";");
		String linha = "";
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i<= palavras.length  ; i++) {
			
			if (i == palavras.length){
				list.add(linha);
				break;
			}
			
			String palavra = palavras[i];
			
			if (linha.length() + palavra.length()  <= numero){
				linha = linha + palavra + " ";
				
			} else {
				list.add(linha);
				linha = palavra + " ";
				
			}
			
			if (palavra.length() > numero ){
				System.out.println("palavra maior que nuemro de coluna ");
				return;
			}
		}
		
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	
	

}
