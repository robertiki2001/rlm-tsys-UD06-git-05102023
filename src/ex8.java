import java.util.Scanner;
public class ex8 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int numsArray[] = new int[10];

        rellenarArray(sc, numsArray);
        mostrarArray(numsArray);
    }

    public static void rellenarArray(Scanner sc, int[] numsArray) 
    {
        for (int i = 0; i < numsArray.length; i++) 
        {
            System.out.print("Introduce el número " + (i + 1) + " del array: ");
            numsArray[i] = sc.nextInt();
        }
    }

    public static void mostrarArray(int[] numsArray)
    {
        for (int i = 0; i < numsArray.length; i++) 
        {
            System.out.println("Número " + (i + 1) + ": " + numsArray[i]);
        }
    }
    
    

}
