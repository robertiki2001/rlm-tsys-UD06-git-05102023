import java.util.Scanner;
import java.util.Random;
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor mínimo del rango: ");
        int minimo = sc.nextInt();
        
        System.out.print("Introduce el valor máximo del rango: ");
        int maximo = sc.nextInt();

        System.out.print("Introduce la cantidad de números aleatorios a generar: ");
        int cantidadNumeros = sc.nextInt();

        System.out.println("Los números aleatorios generados son:");

        generarNumerosAleatoriosEnRango(minimo, maximo, cantidadNumeros);
    }

    public static void generarNumerosAleatoriosEnRango(int minimo, int maximo, int cantidadNumeros) {
        Random random = new Random();

        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = random.nextInt(maximo - minimo + 1) + minimo;
            System.out.println(numeroAleatorio);
        }
    }
}
