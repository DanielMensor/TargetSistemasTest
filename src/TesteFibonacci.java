import java.util.Scanner;

public class TesteFibonacci {

	public static void main(String[] args) {
		
			System.out.println("Escreva o numero para saber se ele pertence a sequencia de Fibonacci");
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			int anterior = 0;
			int atual = 1;
			int i;

			if (n == 0 || n == 1) {
				System.out.println("O numero informado pertence a sequencia de fibonacci");
			} else {

				while (atual < n) {
					i = atual;
					atual = anterior + atual;
					anterior = i;
					System.out.println(atual);
				}

				if (atual == n) {
					System.out.println("O numero informado pertence a sequencia de fibonacci");
				} else {
					System.out.println("O numero informado não pertence a sequencia de fibonacci");
				}
			}
		}catch(Exception ex) {
			System.out.println("Numero informado não valido");
		}

	}

}
