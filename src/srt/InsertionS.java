package srt;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionS {//O(n²)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x=0,y=1;
		System.out.println("Selecione o tamanho da lista"
				+ "\n 0 - 10"
				+ "\n 1 - 100"
				+ "\n 2 - 1000"
				+ "\n 3 - 10000"
				+ "\n 4 - 100000"
				+ "\n 5 - 1000000");
		x = scan.nextInt();
		System.out.println("Selecione como será organizada"
				+ "\n 1 - Aleatória"
				+ "\n 2 - Ordenado Crescentemente"
				+ "\n 3 - Ordenado Decrescentemente");
		y = scan.nextInt();
		int[] vetor = Aleatorio.alea(x,y);
		long tempoInicial = System.currentTimeMillis();
		//System.out.println("Pre sort\n"+Arrays.toString(vetor));
		for(int i=1; i<vetor.length; i++)   {
			int temp = vetor[i];
			int j= i-1;
			while(j>=0 && temp <= vetor[j])   {
				vetor[j+1] = vetor[j];
				j = j-1;
			}
			vetor[j+1] = temp;
		}
		//System.out.println("Pos sort\n"+Arrays.toString(vetor));
		long tempoFinal = System.currentTimeMillis();
		System.out.println("Inicio: "+tempoInicial+" | Final: "+tempoFinal+" | Tempo gasto: "+(tempoFinal-tempoInicial)+"ms");
	}
}
