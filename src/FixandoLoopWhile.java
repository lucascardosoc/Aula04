import java.util.Scanner;

public class FixandoLoopWhile {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int qtdefeijoes=0;
		
		while(qtdefeijoes!=1200) {
			System.out.println("DESAFIO ACERTAR N�MERO");
			System.out.println("Acerte o n�mero de feij�es para avancar");
			qtdefeijoes=leitor.nextInt();
		}
		
		System.out.println("Parab�ns! Voc� acertou o n�mero!");
		leitor.close();

	}

}
