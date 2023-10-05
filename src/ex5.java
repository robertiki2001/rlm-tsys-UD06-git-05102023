import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero decimal para convertirlo a binario: ");
        int numeroDecimal = sc.nextInt();
        
        String binario = decimalABinario(numeroDecimal);

        System.out.println("El número decimal " + numeroDecimal + " en binario es " + binario);
    }

    public static String decimalABinario(int numeroDecimal) {
        if (numeroDecimal == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();

        while (numeroDecimal > 0) {
            int residuo = numeroDecimal % 2;
            binario.insert(0, residuo); 
            numeroDecimal /= 2;
        }

        return binario.toString();
    }

	}
