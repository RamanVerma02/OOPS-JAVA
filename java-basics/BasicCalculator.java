import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, sum, j = 1;

		for (int i = 1; i <= 5; i++,j++) {
			System.out.println("Round " + j);

			System.out.print("Enter first number: ");
			num1 = sc.nextInt();

			System.out.print("Enter Second number: ");
			num2 = sc.nextInt();

			sum = num1 + num2;

			System.out.println("the sum is " + sum);
			System.out.println("------------------");


		}

	}

}