import java.util.Scanner;

public class week3lab5 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.print("Enter the first number: \n");
		num1 = input.nextInt();
		
		System.out.print("Enter the second number: \n");
		num2 = input.nextInt();
		
		System.out.printf("Hello, you entered %d and %d.\n", num1, num2);
	}
}
