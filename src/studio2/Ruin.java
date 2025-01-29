package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double startAmount = 10;
		double winChance = 0.5;
		double winLimit = 11;

		while (startAmount > 0 && startAmount != winLimit) 
		{
			double i = (double)Math.random();
			if (i > 0.5) 
			{

				startAmount++;
			}
			else 
			{
				startAmount--;
			}

		}
		if (startAmount == 0)
		{
			System.out.print("Ruin");
		}
		else 
		{
			System.out.print("Success");
		}
	}

}
