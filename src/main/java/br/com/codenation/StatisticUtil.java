package br.com.codenation;

import java.util.Arrays;

public class StatisticUtil {

	public static int average(int[] elements) {
		int sum = 0;
		for (int i : elements) {
			sum += i;
		}
		return sum/elements.length;
	}

	public static int mode(int[] elements) {
		int moda = -1;
		int ocorrencias = -1;
		
		for (int i = 0; i < elements.length; i++) {
			int contador = 0;
			
			for (int j = 0; j < elements.length; j++) {
				if (elements[i] == elements[j]) contador++;
			}
			
			if (contador > ocorrencias) {
				moda = elements[i];
				ocorrencias = contador;
			}
		}
		
		return moda;
	}
	
	public static int median(int[] elements) {
		Arrays.sort(elements);
		int meio = elements.length/2;
		if (elements.length % 2 == 0) {
			
			return ((elements[meio-1] + elements[meio])/2);
		}
		return elements[meio];
	}
}