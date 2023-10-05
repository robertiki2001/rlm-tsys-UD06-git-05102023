import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero para calcular su factorial: ");
        int numero = sc.nextInt();
        long factorial = calcularFactorial(numero);     
        System.out.println("El factorial de " + numero + " es " + factorial);
    }

    public static long calcularFactorial(int numero) {
    	Scanner sc = new Scanner(System.in);
        if (numero < 0) 
        {
        	System.out.println("El factorial no está definido para números negativos.");
        }

        int factorial = 1;
        for (int i = 1; i <= numero; i++)
        {
            factorial *= i;
        }

        return factorial;
    }

	}

