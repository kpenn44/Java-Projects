// Created by John Sanks
// 8 July 2018

public class ArrayDebug3 
{
	public static void main(String[] args)
	{

		int[] spacesToPrint = {
			20, 18, 17, 16, 15, 15, 15, 15, 15, 15, 16, 17, 18, 20, 0
		};

		int[] hashesToPrint = {
			5, 10, 12, 14, 12, 10, 8, 10, 11, 13, 14, 12, 10, 5
		};

		// Array position counter starts at zero
		int i = 0;



		System.out.println();

		// loop stops when 0 is found in
		// both arrays for current cycle
		while(spacesToPrint[i] != 0 && hashesToPrint[i] != 0)// added value to be evaluated [i]
		{
			for(int val = 0; val < spacesToPrint[i]; ++val) //had to initiate val for both loops
			{
				System.out.print(" ");
			}
			for(int val = 0; val < hashesToPrint[i]; ++val)
			{
				System.out.print("#");
			}
			System.out.println();
			i++;
		}
		System.out.println();
	}
}