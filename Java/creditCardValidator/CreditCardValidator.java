import java.util.Scanner;
public class CreditCardValidator{
	public static void main(String[] args){

		Scanner collect = new Scanner(System.in);

		System.out.println("Hello, kindly Enter Card details to verify");
		String cardNumber = collect.next();
		
        	int sumOfEvenAndOdd = 0;
        	int evenSum = 0;
        	int oddSum = 0;
        	int index = 0;

		for (index = 0; index < cardNumber.length(); index++){
			index += 1;
		}
		if (index > 16 || index < 13){
			System.out.println("invalid card number");	
		}
		else if (cardNumber.charAt(0) == '4'){
			System.out.println("Card Type: Visa Card");
			System.out.println("Credit card Number: " + cardNumber);
			System.out.println("Credit Card Digit Length: " + index);

			
			long numberCardNumber = Long.parseLong(cardNumber);
			while (numberCardNumber != 0) {
				long newNumber = numberCardNumber % 10;
            			numberCardNumber /= 10;
            			index++;

				if (index % 2 == 0) {
                			int digit = (int) newNumber * 2;
					if (digit > 9) {
                    				int value1 = digit / 10;
                    				int value2 = digit % 10;
                    				evenSum += value1 + value2;
                			}
 
					else {
                    				evenSum += digit;
                			}
				} 

				else {
                			int oddDigit = (int) newNumber;
                			oddSum += oddDigit;
				}
        		}

			sumOfEvenAndOdd = evenSum + oddSum;
			if(sumOfEvenAndOdd % 10 == 0){
				System.out.println("Credit Card Validity Status: Valid");
			}
			else{
        			System.out.println("Credit Card Validity Status: invalid");
			}
		}

		else if(cardNumber.charAt(0) == '5'){
			System.out.println("Card Type: Master Card");
			System.out.println("Credit card Number: " + cardNumber);
			System.out.println("Credit Card Digit Length: " + index);

			long numberCardNumber = Long.parseLong(cardNumber);
			while (numberCardNumber != 0) {
				long newNumber = numberCardNumber % 10;
            			numberCardNumber /= 10;
            			index++;

				if (index % 2 == 0) {
                			int digit = (int) newNumber * 2;
					if (digit > 9) {
                    				int value1 = digit / 10;
                    				int value2 = digit % 10;
                    				evenSum += value1 + value2;
                			}
 
					else {
                    				evenSum += digit;
                			}
				} 

				else {
                			int oddDigit = (int) newNumber;
                			oddSum += oddDigit;
				}
        		}

			sumOfEvenAndOdd = evenSum + oddSum;
			if(sumOfEvenAndOdd % 10 == 0){
				System.out.println("Credit Card Validity Status: Valid");
			}
			else{
        			System.out.println("Credit Card Validity Status: invalid");
			}
		}
		
		else if(cardNumber.charAt(0) == '6'){
			System.out.println("Card Type: Discover Card");
			System.out.println("Credit card Number: " + cardNumber);
			System.out.println("Credit Card Digit Length: " + index);

			long numberCardNumber = Long.parseLong(cardNumber);
			while (numberCardNumber != 0) {
				long newNumber = numberCardNumber % 10;
            			numberCardNumber /= 10;
            			index++;

				if (index % 2 == 0) {
                			int digit = (int) newNumber * 2;
					if (digit > 9) {
                    				int value1 = digit / 10;
                    				int value2 = digit % 10;
                    				evenSum += value1 + value2;
                			}
 
					else {
                    				evenSum += digit;
                			}
				} 

				else {
                			int oddDigit = (int) newNumber;
                			oddSum += oddDigit;
				}
        		}

			sumOfEvenAndOdd = evenSum + oddSum;
			if(sumOfEvenAndOdd % 10 == 0){
				System.out.println("Credit Card Validity Status: Valid");
			}
			else{
        			System.out.println("Credit Card Validity Status: invalid");
			}
		}
		
		else if(cardNumber.charAt(0) == '3' && cardNumber.charAt(1) == '7'){
			System.out.println("Card Type: American Express card");
			System.out.println("Credit card Number: " + cardNumber);
			System.out.println("Credit Card Digit Length: " + index);

			long numberCardNumber = Long.parseLong(cardNumber);
			while (numberCardNumber != 0) {
				long newNumber = numberCardNumber % 10;
            			numberCardNumber /= 10;
            			index++;

				if (index % 2 == 0) {
                			int digit = (int) newNumber * 2;
					if (digit > 9) {
                    				int value1 = digit / 10;
                    				int value2 = digit % 10;
                    				evenSum += value1 + value2;
                			}
 
					else {
                    				evenSum += digit;
                			}
				} 

				else {
                			int oddDigit = (int) newNumber;
                			oddSum += oddDigit;
				}
        		}

			sumOfEvenAndOdd = evenSum + oddSum;
			if(sumOfEvenAndOdd % 10 == 0){
				System.out.println("Credit Card Validity Status: Valid");
			}
			else{
        			System.out.println("Credit Card Validity Status: invalid");
			}
		}
		
		else{
			System.out.println("Your card is not a valid card");
			System.out.println("Credit card Number: " + cardNumber);
			System.out.println("Credit Card Digit Length: " + index);
		}
	}
}