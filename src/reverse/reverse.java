//write a program that takes an integer as an input and returns an integer with reversed digit ordering
package reverse;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse=0;
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter num");
		int num=Scanner.nextInt();
		while(num!=0) {
			int digit=num%10;	
			reverse=reverse*10 + digit;

			num/=10;
			System.out.println(+ reverse);
			
		}
	}

}
