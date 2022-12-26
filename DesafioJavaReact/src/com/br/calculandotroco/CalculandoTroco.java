package com.br.calculandotroco;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculandoTroco {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double pago;

		System.out.printf("Informe um Valor para ser trocado : ");
		pago = ler.nextDouble();

		System.out.printf("%s", calculaTroco(pago));

	}

	public static String calculaTroco(double pago) {
		DecimalFormat formatador = new DecimalFormat("###,##0.00");

		int nota[] = { 100, 50, 20, 10, 5, 2, 1 };
		int centavos[] = { 50, 25, 10, 5, 1 };

		int i, valr, ct;

		String result = "\nValor Trocado de  = R$" + formatador.format(pago) + "\n\n";

		valr = (int) pago;
		i = 0;
		while (valr != 0) {
			ct = valr / nota[i];
			if (ct != 0) {
				result = result + (ct + " nota(s) de R$ " + nota[i] + "\n");
				valr = valr % nota[i];
			}
			i = i + 1;
		}

		result = result + "\n";

		valr = (int) Math.round((pago - (int) pago) * 100);
		i = 0;
		while (valr != 0) {
			ct = valr / centavos[i];
			if (ct != 0) {
				result = result + (ct + "moeda(s) de" + centavos[i] + "centavo(s)\n");
				valr = valr % centavos[i];
			}
			i = i + 1;
		}

		return (result);
	}
}
