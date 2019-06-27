package excercise5;
import java.util.Scanner;
interface Interface1{
	int fact(int num);
}
class Class1{
	public static int factorial(int num) {
		int fact=1;
		for(int i=num;i>1;i--) {
			fact=fact*i;
		}
		return fact;
	}
}

public class Fact {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num=s.nextInt();
		Interface1 i=Class1::factorial;
		int fact=i.fact(num);
		System.out.println("Factorial of "+num+" is: "+fact);

	}

}
