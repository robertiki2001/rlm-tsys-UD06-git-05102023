import java.util.Scanner;
import java.util.Random;
public class ex10 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Introduce la dimensión del array: ");
        int totalValoresArray = sc.nextInt();
        int numsArray[] = new int[totalValoresArray];
        
		System.out.print("Introduce el valor mínimo del array: ");
        int valorMinimo = sc.nextInt();
        
		System.out.print("Introduce el valor màximo array: ");
        int valorMaximo = sc.nextInt();
        
        rellenarArray(numsArray, random, valorMinimo, valorMaximo);
        mostrarArray(numsArray);
        
        System.out.print("El número primo más grande és: "+ valorMasGrande(numsArray) );
         
	}
	
	
    public static void rellenarArray(int[] numsArray, Random random, int valorMinimo, int valorMaximo) 
    {
        for (int i = 0; i < numsArray.length; i++) 
        {
            int numeroPrimoAleatorio = generarPrimoAleatorio(random, valorMinimo, valorMaximo);
            numsArray[i] = numeroPrimoAleatorio;
        }
    }
    
    public static boolean esPrimo(int numero) 
    {
        if (numero <= 1) 
        {
            return false;
        }
        if (numero <= 3) 
        {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) 
        {
            return false;
        }
        int i = 5;
        while (i * i <= numero) 
        {
            if (numero % i == 0 || numero % (i + 2) == 0) 
            {
                return false;
            }
            i += 6;
        }
        return true;
    }
    
    public static int generarPrimoAleatorio(Random random, int valorMinimo, int valorMaximo) 
    {
        int numeroAleatorio;
        do 
        {
            numeroAleatorio = random.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
        } 
        while (!esPrimo(numeroAleatorio));
        return numeroAleatorio;
    }
    
    public static void mostrarArray(int[] numsArray) 
    {
        for (int i = 0; i < numsArray.length; i++) 
        {
            System.out.println("Valor en la posición " + (i+1) + " -> " + numsArray[i]);
        }
    }
    
    public static int valorMasGrande(int[] numsArray) 
    {
    	int valorMayor = numsArray[0];
        for (int i = 0; i < numsArray.length; i++) 
        {
        	if(numsArray[i] > valorMayor) 
        	{
        		valorMayor = numsArray[i];
            }
           
        }
    	return valorMayor;
    }

}
