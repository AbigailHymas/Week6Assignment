//Abigail Hymas

import java.util.Scanner;
import java.util.Random;

public class Abigail_Hymas_Week6Assignment {

	public static void main(String[] args) {
		
	System.out.println("--------------------------------------------------------");
	System.out.println("Part 1 for loop: Average of randomly generated integars");
	System.out.println("--------------------------------------------------------");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the bottom number of the range: ");
		int bottom = input.nextInt();
		System.out.print("Enter the top number of the range: ");
		int top = input.nextInt();
		System.out.print("Enter how many numbers to generate: ");
		int num = input.nextInt();
		System.out.print("Generated Random Numbers: ");
		
		int sum = 0;
		double average;
		for(int i = 0; i<num; i++)
		{	
			int randomNumber = getRandomNumber(bottom,top);
			sum = sum + randomNumber;
			System.out.print(randomNumber+ " ");
			
		}
		System.out.println();
		average = sum*1.0;
		System.out.println("Averge of Generated Numbers: " +average);
		System.out.println("--------------------------------------------------------");
		input.close();	
	}

	private static int getRandomNumber(int min, int max) {
		max = max + 1;
		Random random = new Random();
		return random.nextInt(max - min) + max;
		
	}

}
