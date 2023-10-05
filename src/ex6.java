import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo para contar sus cifras: ");
        int numero = sc.nextInt();
        int cantidadCifras = contarCifras(numero);

        System.out.println("El número " + numero + " tiene " + cantidadCifras + " cifras.");
    }

    public static int contarCifras(int numero) {
		Scanner sc = new Scanner(System.in);
        if (numero < 0) 
        {
        	 System.out.println("El número debe ser positivo.");
        }

        String numeroComoCadena = Integer.toString(numero);
        return numeroComoCadena.length();
    }

}


