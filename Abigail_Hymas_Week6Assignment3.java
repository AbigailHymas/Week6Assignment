//Abigail Hymas
import java.util.Scanner;

public class Abigail_Hymas_Week6Assignment3 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int i;
	do {
		System.out.println("===============================");
		System.out.println("MENU");
		System.out.println("===============================");
		System.out.println("1: Choice 1 ");
		System.out.println("2: Choice 2 ");
		System.out.println("3: Choice 3 ");
		System.out.println("4: Exit ");
		System.out.println("===============================");
		System.out.print("Enter 1, 2, 3, or 4 to Exit: ");
		i = input.nextInt();
	switch(i) {
	case 1:
		break;
	case 2:
		break;
	case 3:
		break;
	case 4:
		System.out.println("Goodbye!");
		break;
	default:
		System.out.println("Invalid Input");
		break;
	}
}
	while(i!=4);
	input.close();
	}
}
