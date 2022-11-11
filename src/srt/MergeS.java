package srt;

import java.util.Scanner;

public class MergeS {//O(nlogn)
	
	void merge(int vetor[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i){
            L[i] = vetor[l + i];	
        }
        for (int j = 0; j < n2; ++j){
            R[j] = vetor[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2){
            if (L[i] <= R[j]) {
            	vetor[k] = L[i];
                i++;
            }
            else {
            	vetor[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1){
        	vetor[k] = L[i];
            i++;
            k++;
        } 
        while (j < n2){
        	vetor[k] = R[j];
            j++;
            k++;
        }
    }
    void sort(int vetor[], int l, int r){
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(vetor, l, m);
            sort(vetor, m + 1, r);
            merge(vetor, l, m, r);
        }
    }
    public static void main(String args[]){
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
       // System.out.println("Pre sort\n"+Arrays.toString(vetor));
 
        MergeS ob = new MergeS();
        ob.sort(vetor, 0, vetor.length - 1);
 
       // System.out.println("Pos sort\n"+Arrays.toString(vetor));
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Inicio: "+tempoInicial+" | Final: "+tempoFinal+" | Tempo gasto: "+(tempoFinal-tempoInicial)+"ms");
    }
}
