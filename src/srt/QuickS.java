package srt;

import java.util.Arrays;
import java.util.Scanner;

public class QuickS {//PiorCaso O(n²)/MelhorCaso O(nlog2n)
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int aux,x=0,y=1;
	boolean troca = true;
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
	//System.out.println("Pre sort\n"+Arrays.toString(vetor));//A partir de um certo ponto o codigo decide não imprimir
    while (troca) {
        troca = false;
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                aux = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = aux;
                troca = true;
               //System.out.println(Arrays.toString(vetor));
            }
        }
    }
    //System.out.println("Pos sort\n"+Arrays.toString(vetor));//A partir de um certo ponto o codigo decide não imprimir
    long tempoFinal = System.currentTimeMillis();
    System.out.println("Inicio: "+tempoInicial+" | Final: "+tempoFinal+" | Tempo gasto: "+(tempoFinal-tempoInicial)+"ms");
	}
}
