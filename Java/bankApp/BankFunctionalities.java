import java.util.Random;
public class BankFunctionalities{
	public static String generateAccountNumber(){

		Random randomNumber = new  Random();
		String accountNumber = "02";
		for (int index = 1; index <= 8; index++){
			int accNumberGenerator = randomNumber.nextInt(9);
			accountNumber += String.valueOf(accNumberGenerator);
		}
		return accountNumber;
	}

}