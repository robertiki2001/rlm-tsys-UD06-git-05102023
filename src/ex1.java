import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el nombre de la figura para calcular su àrea: ");
		
		String figura =  sc.nextLine().toLowerCase();
		double area = 0.0;
				
		switch (figura) 
		{
		case "circulo":
            System.out.println("Introduce el radio del círculo: ");
            double radio = sc.nextDouble();
            area = areaCirculo(radio);
            System.out.println("El área del círculo es: "+area);
            break;
        case "triangulo":
            System.out.println("Introduce la base del triángulo: ");
            double base = sc.nextDouble();
            System.out.println("Introduce la altura del triángulo: ");
            double altura = sc.nextDouble();
            area = areaTriangulo(base, altura);
            System.out.println("El área del triangulo es: "+area);
            break;
        case "cuadrado":
            System.out.println("Introduce el lado del cuadrado:");
            double lado = sc.nextDouble();
            area = areaCuadrado(lado);
            System.out.println("El área del cuadrado es: "+area);
            break;
        default:
            System.out.println("La figura introducida no existe");
		}
		
	}
	
	public static double areaCirculo(double radio) {
        return Math.pow(radio, 2) * Math.PI;
    }

    public static double areaTriangulo(double base, double altura) {
        return base * altura / 2;
    }

    public static double areaCuadrado(double lado) {
        return lado * lado;
    }

}
