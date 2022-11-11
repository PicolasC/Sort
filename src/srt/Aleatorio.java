package srt;

import java.util.Arrays;
import java.util.Random;

public class Aleatorio {
	public static int[] alea(int tam,int ord) {
	Random random = new Random();
	int n = 0;
	if(tam == 0) {
		n = 10;	
	}else if (tam == 1) {
		n = 100;
	}else if (tam == 2) {
		n = 1000;
	}else if (tam == 3) {
		n = 10000;
	}else if (tam == 4) {
		n = 100000;
	}else if (tam == 5) {
		n = 1000000;
	}else {
		System.out.println("Não sabe ler?");
	}
	int ale[] = new int[n];
	for (int i = 0; i < n; i++) {
		ale[i] = random.nextInt(11);	
	}
	if(ord == 2) {
	Arrays.sort(ale);
	}	
	if(ord == 3) {
		Arrays.sort(ale);
		int aux[] = new int[n];
		for (int i = 0; i < n; i++) {
			aux[n-1-i] = ale[i];
		}
		ale = aux;
	}
	
		return ale;
	}
	/*public static void main(String[] args) {
		int f[] = alea(5,3);
		System.out.println(Arrays.toString(f));
	}*/
}
