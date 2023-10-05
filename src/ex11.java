import java.util.Random;
import java.util.Scanner;
public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Introduce la dimensión de los arrays: ");
        int cantidadNumerosArray = sc.nextInt();
        int primerArray[] = new int[cantidadNumerosArray];
        int segundoArray[] = new int[cantidadNumerosArray];
        int arraysMultiplicados[] = new int[cantidadNumerosArray];
        
        
        rellenarPrimerArray(primerArray,random);
        rellenarSegundoArray(primerArray,segundoArray,random);
        multiplicarArrays(primerArray,segundoArray,arraysMultiplicados);
        System.out.println("----Array 1----");
        mostrarArray(primerArray);
        System.out.println("");
		System.out.println("----Array 2----");
        mostrarArray(segundoArray);
        System.out.println("");
        System.out.println("----Arrays multiplicados----");
        mostrarArray(arraysMultiplicados);
             
        
	}
	
    public static void rellenarPrimerArray(int[] primerArray,Random random) 
    {
        for (int i = 0; i < primerArray.length; i++) 
        {
	        int numeroAleatorio = random.nextInt(10);
	        primerArray[i] = numeroAleatorio;	            
        }
        
    }
    
    public static void rellenarSegundoArray(int[] primerArray,int[] segundoArray,Random random) 
    {
        for (int i = 0; i < primerArray.length; i++) 
        {
        	for (int j = 0; j < segundoArray.length; j++) 
        	{
        		segundoArray[i]=primerArray[i];
			}
       
        }
        
    }
    
    public static void multiplicarArrays(int[] primerArray, int[] segundoArray, int[] arraysMultiplicados) 
    {
        for (int i = 0; i < primerArray.length; i++) 
        {
            arraysMultiplicados[i] = primerArray[i] * segundoArray[i];
        }
    }
	
	
    public static void mostrarArray(int[] primerArray) 
    {
        for (int i = 0; i < primerArray.length; i++) 
        {
            System.out.println("Valor en la posición " + (i+1) + " -> " + primerArray[i]);
        }
    }

}
