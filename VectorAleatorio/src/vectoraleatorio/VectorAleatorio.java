/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectoraleatorio;
import java.util.Random;

/**
 *
 * @author LENOVO
 */
public class VectorAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Random random = new Random ();
    int[] arreglo = new int[50];

    for (int j = 0; j < 50; j++)
      {
	int randomNumber = random.nextInt (190);
	  arreglo[j] = randomNumber;
      }

    System.out.print ("[");
    for (int i = 0; i < 50; i++)
      {
	System.out.print (arreglo[i] + " ");
      }
    System.out.println ("]");

//pares
    System.out.print ("Los números pares del vector son: [");
    int pares = 0;
    for (int e = 1; e <= 49; e++)
      {
	if (arreglo[e] % 2 == 0)
	  {
	    pares = arreglo[e];
	    System.out.print (pares + " ");
	  }
      }
    System.out.println ("]");

//max min
    int max, min;

    max = min = arreglo[49];

    for (int a = 0; a < 50; a++)
      {

	if (arreglo[a] > max)
	  {

	    max = arreglo[a];

	  }

	if (arreglo[a] < min)
	  {

	    min = arreglo[a];

	  }

      }

    System.out.println ("Valor Máximo = " + max + "\nValor Mínimo = " +
			min);

// promedio
    int suma = 0;
    for (int f = 0; f < 50; f++)
      {
	suma = suma + arreglo[f];
      }
    // El promedio es la suma dividida entre la cantidad de elementos
    float promedio = suma / 50;
    System.out.printf ("Suma: %d. Promedio: %f", suma, promedio);
    }
    
}
