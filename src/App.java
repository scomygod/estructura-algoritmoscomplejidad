import java.util.Arrays;
import java.util.Random;
public class App {
    public static void main(String[] args) {
        Ordenamiento ordenamiento = new Ordenamiento();
        //Definir los tamaños para los arreglos
        int[] tamanos = {10, 20, 100, 1000, 5000, 10000, 30000};

        //Generar el arreglo base una vez
        int maxTamano = tamanos[tamanos.length - 1]; //El tamaño máximo del arreglo será mehor que [30000] -el último elemento 
        int[] arregloBase = generarArregloAleatorio(maxTamano);

        //Bucle for
        for (int tamano : tamanos) {
            int[] arreglo = Arrays.copyOf(arregloBase, tamano); //Copia del arreglo con tamaño recorrido con el bucle 'for'
            long tiempoInicio;
            double tiempoFin;

            //Impresión de los arreglos [comentado para que no muestre todos los números]
            //System.out.println("Arreglo de " + tamano + " elementos: " + Arrays.toString(arreglo));
            
            //Imprime solo el tamaño de los arreglos sin los valores
            System.out.println("Arreglo de " + tamano + " elementos:");

            // Ordenamiento Burbuja Mejorado

            //Clonar el arreglo
            int[] copiaArreglo = arreglo.clone();
            //Empezar a registar el tiempo antes de ejecutar el algoritmo
            tiempoInicio = System.nanoTime(); 
            //Ordenar el arreglo
            ordenamiento.sortByBubbleImproved(copiaArreglo); 
            //Registrar el tiempo al terminar de ejecutar el algoritmo 
            tiempoFin = System.nanoTime(); 
            //Calcular el tiempo transcurrido y transformarlo a segundos 
            double tiempoBurbuja = (tiempoFin - tiempoInicio) / 1_000_000_000.0;
            //Imprimir el tiempo de ejecución 
            System.out.println("Tiempo de ejecución (Burbuja Mejorado): " + tiempoBurbuja + " segundos");

            // Ordenamiento Selección
            copiaArreglo = arreglo.clone(); 
            tiempoInicio = System.nanoTime();
            ordenamiento.sortBySelection(copiaArreglo);
            tiempoFin = System.nanoTime();
            double tiempoSeleccion = (tiempoFin - tiempoInicio) / 1_000_000_000.0;
            System.out.println("Tiempo de ejecución (Selección): " + tiempoSeleccion + " segundos");

            // Ordenamiento Inserción
            copiaArreglo = arreglo.clone();         
            tiempoInicio = System.nanoTime();      
            ordenamiento.sortByInsertion(copiaArreglo);
            tiempoFin = System.nanoTime();
            double tiempoInsercion = (tiempoFin - tiempoInicio) / 1_000_000_000.0;
            System.out.println("Tiempo de ejecución (Inserción): " + tiempoInsercion + " segundos");

            System.out.println();
        }
    }

    // Método que genera un arreglo aleatorio de tamaño dado
    public static int[] generarArregloAleatorio(int tamano) {
        Random random = new Random();
        int[] arreglo = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            arreglo[i] = random.nextInt(100);
        }
        return arreglo;
    }
}

