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

//	public static int mode(int[] elements) {
//		Arrays.sort(elements);
//		int moda = 0;
//		int bimodal = 0;
//		int contador = 0;
//		int ocorrencia = 1;
//		for(int i = 0; i < (elements.length -1); i++) {
//			if (elements[i] != elements[i+1]) {
//				i++;
//			} else {
//				ocorrencia++;
//				if (ocorrencia < contador) {
//					 i++;
//				} else if (ocorrencia == contador){
//					bimodal++;
//					i++;
//				} else {
//					contador = ocorrencia;
//					moda = elements[i];
//					bimodal = 0;
//				}
//			} 
//		}
//		if (bimodal > 0) {
//			return 0;
//		}
//		return moda;
//	}
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
	
	/**
	 * 
	 * Calculando a moda usando HashMap... (obtido no github)
	 * https://github.com/rbhadti94/JavaStat/blob/master/src/main/java/statistics/base/Mode.java
	 * 
	 * 	public final static double mode(double[] arr){
		//Loop through array and store values in map.
		Map<Double, Integer> modalMap = new HashMap<Double, Integer>();
		for(int i = 0; i < arr.length; i++){
			//If it isn't contained in the map.
			if(!modalMap.containsKey(arr[i])){
				modalMap.put(arr[i], 1);
			}
			//If it already exists in the map.
			else{
				modalMap.replace(arr[i], modalMap.get(arr[i])+1);
			}
		}
		//Get the count values and convert to array.
		Collection<Integer> x = modalMap.values();
		List<Double> keys = new ArrayList<Double>(modalMap.keySet());
		Object[] y = x.toArray();
		int currMaxIndex = 0;
		
		for(int i = 0; i < x.size(); i++){
			//There are 2 modal values.
			if((Integer)y[i] == (Integer)y[currMaxIndex]){
				currMaxIndex = keys.get(currMaxIndex) < keys.get(i) ? currMaxIndex : i;
			}
			
			//The count at the current index is equal.
			else if((Integer)y[i] > (Integer)y[currMaxIndex]){
				currMaxIndex=i;
			}
		}
		
		//Mode returns the lowest value number with the greatest no.
		//of occurences.
		return keys.get(currMaxIndex);
	}
	 * 
	 */
	

	public static int median(int[] elements) {
		Arrays.sort(elements);
		int meio = elements.length/2;
		if (elements.length % 2 == 0) {
			
			return ((elements[meio-1] + elements[meio])/2);
		}
		return elements[meio];
	}
}