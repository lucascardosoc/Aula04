import java.util.Scanner;

public class FixandoLoopWhile {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int qtdefeijoes=0;
		
		while(qtdefeijoes!=1200) {
			System.out.println("DESAFIO ACERTAR NÚMERO");
			System.out.println("Acerte o número de feijões para avancar");
			qtdefeijoes=leitor.nextInt();
		}
		
		System.out.println("Parabéns! Você acertou o número!");
		leitor.close();

	}

}
