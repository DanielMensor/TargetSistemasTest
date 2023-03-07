import java.util.Scanner;

public class InverteSring {

	public static void main(String[] args) {

		
		System.out.println("Escreva a palavra ou frase a ser invertida:");
		Scanner s = new Scanner(System.in);
		String string = s.nextLine();
		
		String stringInvertida="";
		for(int i = string.length()-1;i>=0;i--) {
			stringInvertida = stringInvertida +string.charAt(i);
		}
		System.out.println(stringInvertida);

		s.close();
	}


}
