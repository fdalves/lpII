import java.util.Scanner;


public class Exe1QuadradoNumero {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite Numero: ");
		
		int numero = s.nextInt();
		double quadrado = Math.pow(numero, 2);
		
		StringBuffer sb = new StringBuffer();
		int countN = 0;
		
		for (int i = 0; i < quadrado; i++) {
			if (i % 2 != 0){
				sb.append(i);
				countN ++;
				if (countN == numero) break;
				sb.append(" + ");
			}
		}
		
		System.out.println("Quadrado de " + numero +" é "+ quadrado +" = " + sb.toString());
	}

}
