import java.util.Scanner;

public class Week3Lab6 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int number1; // first number
		int number2; // second number
		int sum; // sum of number1 and number2
		int diff; // difference of number1 and number2
		int product; // product of number1 and number2
		int quotient; // quotient of number1 and number2
		
		System.out.print("Enter first number: \n");
		number1 = input.nextInt();
		
		System.out.print("Enter the second number: \n");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		diff = number1 - number2;
		product = number1 * number2;
		quotient = number1 / number2;
		
		System.out.printf("Hello, you entered %d and %d\n", number1, number2);
		System.out.printf("The sum of the first number and the second number is %d\n", sum);
		System.out.printf("The difference of the first number and the second number is %d\n", diff);
		System.out.printf("The product of the first number and the second number is %d\n", product);
		System.out.printf("The quotient of the first number and the second number is %d\n", quotient);
	}
}
// Ok for all labs
