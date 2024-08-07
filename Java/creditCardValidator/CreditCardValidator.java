import java.util.Scanner;
public class CreditCardValidator{
	public static void main(String[] args){

		Scanner collect = new Scanner(System.in);

		System.out.println("Hello, kindly Enter Card details to verify");
		long accountNumber = collect.nextLong();
		
		int index = 0;
		for (index = 0; index < accountNumber.length; index++){
			index += 1;
		}
		if (index > 16 || index < 13){
			System.out.println("invalid card number " + index);
			
		}
		
	}
}