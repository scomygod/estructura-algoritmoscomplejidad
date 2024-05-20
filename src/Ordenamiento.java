import java.util.Arrays;

public class Ordenamiento {

    //Algortimos de ordenamiento
    //Método Burbuja con ajuste Ascendente
    public int[] sortByBubbleImproved(int[] arregloInicial) {
        System.out.println("Ordenado con algoritmo Burbuja Mejorado.");
        int[] arreglo = Arrays.copyOf(arregloInicial, arregloInicial.length);
        int n = arreglo.length;
        boolean intercambio = true;   
        for (int i = 0; i < n - 1 && intercambio; i++) {
            intercambio = false; 
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {

                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambio = true; 

                }
            }
        }
        return arreglo;
    }

    //Método Selección Ascendente
    public int [] sortBySelection(int[] arregloInicial) {    
        System.out.println("Ordenando con algoritmo Selección.");
        int [] arreglo =Arrays.copyOf(arregloInicial, arregloInicial.length);
        int n = arreglo.length;    
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;   

        }
        return arreglo;
    }

    //Método Inserción 
    public int [] sortByInsertion(int[] arregloInicial) {
        System.out.println("Ordenando con algoritmo Inserción.");
        int [] arreglo =Arrays.copyOf(arregloInicial, arregloInicial.length);
        int n = arreglo.length;           
        for (int i = 1; i < n; i++) {
            int key = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > key) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = key;

        }
        return arreglo;
    }

    //Método que imprime un arreglo     
    public void imprime (int [] arreglo) {
        for (int i = 0; i < arreglo.length; i++)
            System.out.print(arreglo[i] + " " );
            System.out.println(" ");                    
    } 
}
