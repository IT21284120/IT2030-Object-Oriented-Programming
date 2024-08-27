import java.util.Random;
public class MyMain 

{

	   public static void main(String args[])

	    {

	        Random objRandom = new Random();
	        int[][] number = new int[5][5];

	        System.out.println("Random Numbers - 2D Array\n");

	        for (int a = 0; a < number.length; a++)
			
			{
	            for (int j = 0; j < number.length; j++) 
				
				{

	                number[a][j] = objRandom.nextInt(100);
	                System.out.print(number[a][j] + " ");

	            }
				
	            System.out.println();

	        }

	        RandNum value = new RandNum();
	       
	        System.out.println("\nThe Maximum Number  : " + value.maximum(number));
	        System.out.println("\nThe Minimum Number  : " + value.minimum(number));
	        System.out.println("\nAverage of Random Number : " + value.displayAvg(number));

	   
		}

}
