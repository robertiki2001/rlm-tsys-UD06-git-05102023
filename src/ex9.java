import java.util.Scanner;
import java.util.Random;
public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
		                
		        Random random = new Random();

		        
		        System.out.print("Introduce la dimensión del array: ");
		        int totalnumsArray = sc.nextInt();
		        int numsArray[] = new int[totalnumsArray];
		        
		        rellenarArray(numsArray,random);		        
		        mostrarSumaArray(numsArray);
		    }

		    public static void rellenarArray(int[] numsArray,Random random) 
		    {
		        for (int i = 0; i < numsArray.length; i++) 
		        {
			        int numeroAleatorio = random.nextInt(10);
		            numsArray[i] = numeroAleatorio;	            
		        }
		        
		    }
		    
		    public static void mostrarSumaArray(int[] numsArray) 
		    {
		    	int suma = 0;
		        for (int i = 0; i < numsArray.length; i++) 
		        {
		        	System.out.println("Valor: "+(i+1)+"-> "+numsArray[i]);		        	
		            suma += numsArray[i];
		        }
		        System.out.print("El total de la suma de los valores del array es: "+suma);
		    }

	}


