//Abigail Hymas
import java.util.Scanner;

public class Abigail_Hymas_Week6Assignment2 {

	public static void main(String[] args) {
	System.out.println("---------------------------------------------------------------------");
	System.out.println("Part 2 while loop: Average of user-entered integers using While loop");
	System.out.println("---------------------------------------------------------------------");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integers to average. Enter -1 to finish.\n");
		int num = 0;
		int sum = 0;
		int i = 1;
	while(num!=-1)
	{
		System.out.print("Entry " + i + ": ");
		num = input.nextInt();
		if(num!=-1);
		
	{ sum = sum + num; ++i;
		
	}	
	}
	
	System.out.println("Number of enteries: "+(i-1));
	double average = sum/(i-1);
	System.out.println("Average of user-entered numbers: " +average);
	System.out.println("---------------------------------------------------------------------");
	input.close();
	}

}
