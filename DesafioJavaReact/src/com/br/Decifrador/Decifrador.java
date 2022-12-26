package com.br.Decifrador;
import java.util.Scanner;

public class Decifrador {

	public static void main(String[] args) {
		int n = 0;
		int z = 1;
		String input = "";

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a quantidade de entradas : ");
		n = ler.nextInt();

		while (z <= n) {
		
			input = ler.next();

			// 1- Quebrar a frase no meio
			String left = input.substring(0, (input.length() / 2));
			String right = input.substring((input.length() / 2), input.length());

			// 2 - Transformar as duas strings em um array de char
			char[] letfArr = left.toCharArray();
			char[] rightArr = right.toCharArray();

			StringBuilder finalText = new StringBuilder();

			// 3 - Ordenar o array de char da esquerda, do meio para a margem
			for (int i = letfArr.length - 1; i >= 0; i--) {

				finalText.append(letfArr[i]);
			}

			// 4 - Ordenar o array de char da direita, da margem para o meio
			for (int i = rightArr.length - 1; i >= 0; i--) {

				finalText.append(rightArr[i]);
			}

			// 5 - Juntar o resultdo dos dois arrays na string que será o resultado final
			
			System.out.println("Resultado Decifrado: " + finalText.toString());
			z++;
		}

	}
}