package projeto;

public class CodigoBubbleSort {
	
	public static int[] generateRandomArray(int size) {
        int[] valor = new int[size];
        for (int i = 0; i < size; i++) {
        	valor[i] = (int) (Math.random() * size * 10);
        }
        return valor;
    }
	
	public static void bubbleSort(int[] valor) {
		
		int n = valor.length;
		long comparar = 0;
		long troca = 0;
		
		long inicio = System.nanoTime();
		
		boolean trocab;
		
		for (int i = 0; i < n - 1; i++) {
			trocab = false;
			for(int j = 0; j < n - i - 1; j++) {
				comparar++;
				if(valor[j] > valor[j + 1]) {
					int temp = valor[j];
					valor[j] = valor[j + 1];
					valor[j + 1] = temp;
                    trocab = true;
                    troca++;
				}
			}
			
			if(!trocab) {
				break;
			}
		}
		
		long fim = System.nanoTime();
        long tempo = (fim - inicio) / 1000000;
        
        System.out.println("Número total de comparações: " + comparar);
        System.out.println("Número total de trocas: " + troca);
        System.out.println("Tempo de execução: " + tempo + " ms");
	}

	public static void main(String[] args) {
		
		int[] valor1 = generateRandomArray(100000);
        System.out.println("####### Teste com 100.000 números #######");
        bubbleSort(valor1);
        
        int[] valor2 = generateRandomArray(500000);
        System.out.println("\n####### Teste com 500.000 números #######");
        bubbleSort(valor2);
        
        int[] valor3 = generateRandomArray(1000000);
        System.out.println("\n####### Teste com 1.000.000 números #######");
        bubbleSort(valor3);

	}

}