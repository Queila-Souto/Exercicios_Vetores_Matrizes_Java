// Programa para ler um vetor de 8 posições. No final deve somar o valor correspondente as posições X e Y, determinadas pelo usuário.
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int t = 8; // tamanho do vetor
			int vetor1[] = new int[t];
			int x = 0;
			int y = 0;
			
			for (int i = 0 ; i<t ; i++) {
				System.out.println("Digite um numero para o vetor:");
				vetor1[i] = ler.nextInt();
						} // Definindo vetor
			
			System.out.println("===========================================");
			System.out.println("Digite a posição do vetor");
			x = ler.nextInt();
			System.out.println("O valor da posição "+ x + " é " + vetor1[x]); // Exibição do valor correspondente a posição x
			
			System.out.println("===========================================");
			System.out.println("Digite a posição do vetor");
			y = ler.nextInt();
			System.out.println("O valor da posição "+ y + " é " + vetor1[y]); // Exibição do valor correspondente a posição y
			
			System.out.println("===========================================");
			int resultado = vetor1[x] + vetor1[y]; // soma dos valores correspondentes a posição x e y
			System.out.println("A soma é " + resultado);
		}



	}
	}
