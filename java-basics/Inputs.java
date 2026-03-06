import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number: ");

		int rollno = input.nextInt();
		System.out.println("your roll number is: "+ rollno);

		// we can also write big numbers //
		int n= 230_000_000;
		System.out.println(n);

		// one word input & print way //
		String name = input.next();      //for only one word
		System.out.println("HI "+name);
		
		input.nextLine(); // clear the leftover new line

		// string input & print 
		String designation = input.nextLine(); // for whole line
		System.out.println(name +" "+designation);

		// float way //
		float marks = input.nextFloat();
		System.out.println(marks);

	}

}
