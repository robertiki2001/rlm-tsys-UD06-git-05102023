import java.util.Scanner;
public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la cantidad de euros: ");
        double euros = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Introduce la moneda a la que quieres cambiar los euros: ");
        String monedaCambio = sc.nextLine();
        
        convertirMoneda(euros, monedaCambio);
     
	}

	public static void convertirMoneda(double euros, String monedaCambio) 
    
    {
    	double tasaDeCambio = 0.0;

        switch (monedaCambio.toLowerCase()) {
            case "libras":
                tasaDeCambio = 0.86;
                break;
            case "dolares":
                tasaDeCambio = 1.28611; 
                break;
            case "yenes":
                tasaDeCambio = 129.852;
                break;
            default:
                System.out.println("La moneda introducida no existe.");
                return; 
        }

        double resultado = euros * tasaDeCambio;
        System.out.println(euros + " euros equivalen a " + resultado + " " + monedaCambio);
    }
}
