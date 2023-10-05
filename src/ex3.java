import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        
        if (esPrimo(numero)) 
        {
            System.out.println(numero + " es un número primo.");
        } 
        else 
        {
            System.out.println(numero + " no es un número primo.");
        }
	}
	
	public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        if (numero <= 3) {
            return true; 
        }

        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }

        return true; 
    }

}
