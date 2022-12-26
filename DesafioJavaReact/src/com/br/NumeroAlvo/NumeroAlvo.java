package com.br.NumeroAlvo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumeroAlvo {
	public static void main(String[] args) {
		int numeroAlvo = 0;
		int valores = 0;
		List<Integer> listaNumeros = new ArrayList<>();

		Scanner ler = new Scanner(System.in);

		System.out.printf("Informe a quantidade de linhas para teste ");
		numeroAlvo = ler.nextInt();

		for (int i = 1; i <= numeroAlvo; i++) {
			valores = ler.nextInt();

			listaNumeros.add(valores);
		}

		var pares = listaNumeros.stream().filter(l -> l % 2 == 0).sorted().collect(Collectors.toList());
		var impares = listaNumeros.stream().filter(l -> l % 2 != 0).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		List<Integer> total = new ArrayList<>();
		total.addAll(pares);
		total.addAll(impares);
		total.forEach(System.out::println);
	}
}
