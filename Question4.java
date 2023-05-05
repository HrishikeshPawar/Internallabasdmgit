package assignment1;
//wap  that ask two numbers from user and print greater number among two 
import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a= s.nextInt();
		System.out.println("Enter Second Number");
		int b=s.nextInt();
		if(a>b)
		System.out.println(a+" Is Grater Than "+b);
		else if(b>a)
			System.out.println(b+" Is Grater Than "+a);	
		else
				System.out.println(a+ " Both Nos Are Equal "+b);
		
	}
}
