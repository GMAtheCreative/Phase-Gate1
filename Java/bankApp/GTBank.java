import java.util.Scanner;
import java.util.ArrayList;

public class GTBank{
	public static void main(String [] args){
		Scanner collect = new Scanner(System.in);

		ArrayList<String>firstName = new ArrayList<>();
		ArrayList<String>lastName = new ArrayList<>();
		ArrayList<String>pin = new ArrayList<>();
		ArrayList<Double>balance = new ArrayList<>();
		ArrayList<String>accountNumber = new ArrayList<>();

		String task = """
		What will you love to do today
			(1) Create Account
			(2) Deposit Money
			(3) Withdraw Money
			(4) Transfer Funds
			(5) Check Account Balance
			(6) Change Account Pin
			(7) Close Account
			""";

		System.out.println("Welcome to Guarantee Trust Bank");

		while(true){
			System.out.println("press \"1\" to perform a transaction");
			int startTransaction = collect.nextInt();
		
			int index = 0;

			while(startTransaction == 1){
				System.out.println(task);
				int taskResponse = collect.nextInt();
				System.out.println();
			
				switch (taskResponse){
				
					case 1:

						String customerAccountNumber = BankFunctionalities.generateAccountNumber();

						System.out.println("Enter First name:");
						String customerFirstName = collect.next();

						System.out.println("Enter Last name:");
						String customerLastName = collect.next();

						System.out.println("Create your own unique pin:");
						String customerpin1 = collect.next();

						System.out.println("Confirm your unique pin:");
						String customerpin2 = collect.next();

						while (!customerpin1.equals(customerpin2)){
							System.out.println("The pin and the confirmation is not matching!");
							System.out.println("Input a four digit pin:");
							customerpin1 = collect.next();

							System.out.println("Confirm your four digit pin:");
							customerpin2 = collect.next();
						}
					

						firstName.add(customerFirstName);
						lastName.add(customerLastName);
						accountNumber.add(customerAccountNumber);
						pin.add(customerpin2);
						balance.add(0.0);
					
						index = firstName.size()-1;

						System.out.println("==================================================");
						System.out.println();

						System.out.println("==================================================");
						System.out.println("WELCOME to the Guaranteed and Trusted Family :)");
						System.out.println("Account Name: " + firstName.get(index) + " " + lastName.get(index));
						System.out.println("Account Number: " + accountNumber.get(index));
						System.out.println("Account Balance: " + balance.get(index));
						System.out.println("==================================================");
						System.out.println();
						break;

					case 2:
						System.out.println("Enter your Account number:");
						String customerAccountNumberForDeposit = collect.next();
						if(accountNumber.contains(customerAccountNumberForDeposit)){

							System.out.println("How much do you want to deposit?");
							double costomerDeposit = collect.nextDouble();
					
							for(int attempts = 1; attempts <= 3; attempts++){
								
								System.out.println("Please enter your unique pin:");
								String customerpin = collect.next();
								int value = accountNumber.indexOf(customerAccountNumberForDeposit);
								String correctPin = pin.get(value);
								if(correctPin.equals(customerpin)){
									if(costomerDeposit >= 100.00){
										double currentCustomerBalance = balance.get(value);
										balance.set(value, currentCustomerBalance + costomerDeposit);
										System.out.println("Deposit Succesful>>>>>>>>>>>>>>>>----------");
										break;
									}
									else{
										System.out.println("Amount too low\n amount has to be above # 100.00");
									}
								}
								else{
									System.out.println("invalid pin");
								}
							}

						}

						else{
							System.out.println("You need to have an account with us to to be able to deposit");
						}
						break;

					case 3:
						System.out.println("Enter your Account number:");
						String customerAccountNumberForWithdrawal = collect.next();
						if(accountNumber.contains(customerAccountNumberForWithdrawal)){

							for(int attempts = 1; attempts <= 3; attempts++){

							System.out.println("How much do you want withdraw?");
							double costomerWithdrawal = collect.nextDouble();
								
								System.out.println("Please enter your unique pin:");
								String customerpin = collect.next();
								int value = accountNumber.indexOf(customerAccountNumberForWithdrawal);
								String correctPin = pin.get(value);
								if(correctPin.equals(customerpin)){
									if(costomerWithdrawal >= 500.00){
										double currentCustomerBalance = balance.get(value);
										if(currentCustomerBalance >= costomerWithdrawal){
            										balance.set(value, currentCustomerBalance - costomerWithdrawal);
											System.out.println("Withdrawal Succesful>>>>>>>>>>>>>>>>----------");
            										break;
        									} 
										else {
            										System.out.println("Insufficient funds.");
        									}

									}
									else{
										System.out.println("Amount too low\nYou cant Withdraw below # 500.00");
									}
								}
								else{
									System.out.println("invalid pin");
								}
								if (attempts == 3) System.out.println("Please make deposits before withdrawal");
							}

						}

						else{
							System.out.println("You need to have an account with us to to be able to withdraw");
						}
						break;

					case 4:
						System.out.println("Enter your Account number:");
						String customerAccountNumberForTransfer = collect.next();
						if(accountNumber.contains(customerAccountNumberForTransfer)){
							
							for(int attempts = 1; attempts <= 3; attempts++){
								System.out.println("Enter Recipient Account:");
								String recipientAccount = collect.nextDouble();
								if(accountNumber.contains(recipientAccount)){
									System.out.println("How much do you want to transfer?");
									double customerTransfer = collect.next();

									for(int pinAttempts = 1; pinAttempts <= 3; pinAttempts++){
										System.out.println("Please enter your unique pin:");
										String customerpin = collect.next();
									
										int value = accountNumber.indexOf(customerAccountNumberForTransfer);
										int count = accountNumber.indexOf(recipientAccount);
										String correctPin = pin.get(value);

										if(correctPin.equals(customerpin)){
											if(costomerWithdrawal >= 100.00){
												double currentCustomerBalance = balance.get(value);
												double recipientBalance = balance.get(count);
												if(currentCustomerBalance >= customerTransfer){
													balance.set(value, currentCustomerBalance - customerTransfer);
													balance.set(value, customerTransfer + recipientBalance);
													System.out.println("Transfer Succesful>>>>>>>>>>>>>>>>----------");
													break;
												}
												else {
													System.out.println("Insufficient funds.");
											}
											else{
												System.out.println("Amount too low for transfer");
											}

										}
									} 
								}
								else{
									System.out.println("This recipient is unrecognised.... please transfer to a valid account");
								}
							}
						else{
							System.out.println("You need to have an account with us to to be able to make Transfers.");
						}
						break;

					case 5:
						System.out.println("Enter your Account number:");
						String customerAccountNumberCheckBalance = collect.next();
						if(accountNumber.contains(customerAccountNumberCheck)){

							System.out.println("Please enter your unique pin:");
							String customerpin = collect.next();
							for(int pinTrial = 1; pinTrial <= 3; pinTrial++){
								System.out.println("Please enter your unique pin:");
								String customerpin = collect.next();
								int value = accountNumber.indexOf(customerAccountNumberCheckBalance);
								String correctPin = pin.get(value);
								if(correctPin.equals(customerpin)){
									System.out.println("==================================================");
									System.out.println("Account Name: " + firstName.get(value) + " " + lastName.get(value));
									System.out.println("Account Number: " + accountNumber.get(value));
									System.out.println("Account Balance: " + balance.get(value));
									System.out.println("==================================================");
								}
								else{
									System.out.println("Invalid pin");
								}
							}
						}
						else{
							System.out.println("Account not found");

					default:
						System.out.println("invalid response");
						break;
				}
			System.out.println();
			System.out.println("Will you love to keep transacting \npress \"1\" to perform a transaction:");
			startTransaction = collect.nextInt();
			}

			System.out.println("where satisfied with our service?");
			String saticaction = collect.next();
		}
	}
}