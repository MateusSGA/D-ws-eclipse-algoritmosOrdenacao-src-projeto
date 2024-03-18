package projeto;

public class CodigoInsertionSort {
	
	public static int[] generateRandomArray(int size) {
    	
        int[] valor = new int[size];
        for (int i = 0; i < size; i++) {
        	valor[i] = (int) (Math.random() * size * 10);
        }
        return valor;
    }
    
    public static void insertionSort(int[] valor) {
    	
        int n = valor.length;
        long comparar = 0;
        long troca = 0;
        
        long inicio = System.nanoTime();
        
        for (int i = 1; i < n; ++i) {
            int chave = valor[i];
            int j = i - 1;

            while (j >= 0 && valor[j] > chave) {
            	valor[j + 1] = valor[j];
                j = j - 1;
                comparar++;
                troca++;
            }
            valor[j + 1] = chave;
        }
        
        long fim = System.nanoTime();
        long tempo = (fim - inicio) / 10000000;
        
        System.out.println("Número total de comparações: " + comparar);
        System.out.println("Número total de trocas: " + troca);
        System.out.println("Tempo de execução: " + tempo + " ms");
    }

    public static void main(String[] args) {
    	
        int[] valor1 = generateRandomArray(100000);
        System.out.println("####### Teste com 100.000 números #######");
        insertionSort(valor1);
        
        int[] valor2 = generateRandomArray(500000);
        System.out.println("\n####### Teste com 500.000 números #######");
        insertionSort(valor2);
        
        int[] valor3 = generateRandomArray(1000000);
        System.out.println("\n####### Teste com 1.000.000 números #######");
        insertionSort(valor3);
    }
}