import java.util.*;

public class fizzbuzz {

	public static void main(String[] args) {
		System.out.println("Welcome the FizzBuzz!");
		
		for(int number = 1; number <= 100; number++) {
			if(number % 3 == 0 && number % 5 == 0) {
				System.out.print(number + " ");
				System.out.println("FizzBuzz!");				
			}
			else if(number % 5 == 0) {
				System.out.print(number + " ");
				System.out.println("Buzz");
			}
			else if(number % 3 == 0) {
				System.out.print(number + " ");
				System.out.println("Fizz");
			}
			else
				System.out.println(number);
		}
		
	}

}
