import java.util.Random;
import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Introduce la dimensión del array: ");
        int cantidadValoresArray = sc.nextInt();
        int valoresArray[] = new int[cantidadValoresArray];

        rellenarArray(valoresArray, random);

        System.out.print("Introduce un dígito para ver aquellos números que acaban en un número específico: ");
        int terminacion = sc.nextInt();
        int valoresConTerminacion[] = compararYAgregarNumeros(valoresArray, terminacion);

        System.out.println("Números que acaban en " + terminacion + ":");
        for (int numero : valoresConTerminacion)
        {
            System.out.println(numero);
        }
    }

    public static void rellenarArray(int[] valoresArray, Random random) 
    {
        for (int i = 0; i < valoresArray.length; i++) 
        {
            int numeroAleatorio = random.nextInt(300);
            valoresArray[i] = numeroAleatorio;
        }
    }

    public static int[] compararYAgregarNumeros(int[] valoresArray, int terminacion) 
    {
        int[] valoresConTerminacion = new int[valoresArray.length];
        int contador = 0;

        for (int numero : valoresArray) 
        {
            if (terminacionIgual(numero, terminacion))
            {
                valoresConTerminacion[contador] = numero;
                contador++;
            }
        }

        int[] resultado = new int[contador];
        System.arraycopy(valoresConTerminacion, 0, resultado, 0, contador);

        return resultado;
    }

    public static boolean terminacionIgual(int numero, int terminacion)
    {
        int terminacionNumero = numero % 10;
        return terminacionNumero == terminacion;
    }
}
