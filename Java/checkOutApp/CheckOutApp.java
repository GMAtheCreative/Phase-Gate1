import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckOutApp{
	public static void main(String... semicolon){

		LocalDateTime now = LocalDateTime.now();
		Scanner collect = new Scanner(System.in);
		
       		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        	String formattedDateAndTime = now.format(formatter);

		ArrayList<String> namesOfItems = new ArrayList<>();
		ArrayList<Integer> quantityOfItems = new ArrayList<>();
		ArrayList<Double> pricesOfEachItem = new ArrayList<>();
		ArrayList<Double> total = new ArrayList<>();
		double subTotal = 0;
		
		double vat = 0;
		double billTotal = 0;
		double leftOver = 0;
		String phoneNumber = "+2349060008609";


		System.out.println("what is the customers name?");
		String customerName = collect.next();

		while(true){

			System.out.println("what did the buyer buy?");
			String items = collect.next();

			System.out.println("How many pieces?");
			int itemCount = collect.nextInt();

			System.out.println("How much per unit?");
			double amountPerItem = collect.nextInt();

			System.out.println("Add more items?");
			String continuationCondition = collect.next();

			namesOfItems.add(items);
			quantityOfItems.add(itemCount);
			pricesOfEachItem.add(amountPerItem);
			

			if (continuationCondition.equalsIgnoreCase ("no")){
				break;
			}

		}

		System.out.println("What is your name?");
		String cashierName = collect.next();
		
		System.out.println("How much discount will " + customerName + " get?");
		int discountToGive = collect.nextInt();

		
		for(int index = 0; index < quantityOfItems.size(); index++){
			double result = pricesOfEachItem.get(index) * quantityOfItems.get(index);
			total.add(result);

			subTotal += total.get(index);
		}

		double discountPercentage = discountToGive / 100;
		double discount = subTotal * discountPercentage;

		vat = subTotal * 0.1750;

		billTotal = subTotal + vat - discount;
		
		System.out.println();

		// lets print the table for the cashier
		System.out.println("SEMICOLON STORES \nMAIN BRANCH \nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS. \nTEL: " + phoneNumber +"\nDate: " + formattedDateAndTime +"\nCashier: " + cashierName +"\nCustomer's name: " + customerName);

		System.out.println("===================================================================");
		System.out.println("          ITEM          QTY   PRICE   TOTAL(NGN)");
		System.out.println("-------------------------------------------------------------------");

		for(int index = 0; index < namesOfItems.size(); index++){
			System.out.printf("%15s%10s%10s%10s", namesOfItems.get(index), quantityOfItems.get(index), pricesOfEachItem.get(index), total.get(index));
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("                          Sub Total:  %10s%n", subTotal);
		System.out.printf("                           Discount:  %10s%n", discount); 
		System.out.printf("                        Vat @ 17.50:  %10s%n", vat);
		System.out.println("===================================================================");
		System.out.printf("                         Bill Total:  %10s%n", billTotal);
		System.out.println("===================================================================");
		System.out.println("THIS IS NOT A RECEIPT KINDLY PAY " + billTotal);

		System.out.println("How much did " + customerName + " give to you?");
		double amountPaid = collect.nextDouble();

		if(amountPaid > billTotal){
			leftOver = amountPaid - billTotal;

			System.out.println("SEMICOLON STORES \nMAIN BRANCH \nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS. \nTEL: " + phoneNumber +"\nDate: " + formattedDateAndTime +"\nCashier: " + cashierName +"\nCustomer's name: " + customerName);

			System.out.println("===================================================================");
			System.out.println("          ITEM          QTY   PRICE   TOTAL(NGN)");
			System.out.println("-------------------------------------------------------------------");

			for(int index = 0; index < namesOfItems.size(); index++){
				System.out.printf("%15s%10s%10s%10s", namesOfItems.get(index), quantityOfItems.get(index), pricesOfEachItem.get(index), total.get(index));
				System.out.println();
			}
			System.out.println("-------------------------------------------------------------------");
			System.out.printf("                          Sub Total:  %10.2f%n", subTotal);
			System.out.printf("                           Discount:  %10.2f%n", discount); 
			System.out.printf("                        Vat @ 17.50:  %10.2f%n", vat);
			System.out.println("===================================================================");
			System.out.printf("                         Bill Total:  %10.2f%n", billTotal);
			System.out.printf("                        Amount paid:  %10.2f%n", amountPaid);
			System.out.printf("                            Balance:  %10.2f%n", leftOver);
			System.out.println("===================================================================");
			System.out.println("                    THANKS FOR YOUR PATRONAGE");
			System.out.println("===================================================================");
		}

		else{
			leftOver = amountPaid;

			System.out.println("SEMICOLON STORES \nMAIN BRANCH \nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS. \nTEL: " + phoneNumber +"\nDate: " + formattedDateAndTime +"\nCashier: " + cashierName +"\nCustomer's name: " + customerName);

			System.out.println("===================================================================");
			System.out.println("          ITEM          QTY   PRICE   TOTAL(NGN)");
			System.out.println("-------------------------------------------------------------------");

			for(int index = 0; index < namesOfItems.size(); index++){
				System.out.printf("%15s%10s%10s%10s", namesOfItems.get(index), quantityOfItems.get(index), pricesOfEachItem.get(index), total.get(index));
				System.out.println();
			}
			System.out.println("-------------------------------------------------------------------");
			System.out.printf("                          Sub Total:  %10.2f%n", subTotal);
			System.out.printf("                           Discount:  %10.2f%n", discount); 
			System.out.printf("                        Vat @ 17.50:  %10.2f%n", vat);
			System.out.println("===================================================================");
			System.out.printf("                         Bill Total:  %10.2f%n", billTotal);
			System.out.printf("                        Amount paid:  %10.2f%n", amountPaid);
			System.out.println("===================================================================");
			System.out.println("                    THANKS FOR YOUR PATRONAGE");
			System.out.println("===================================================================");


		}
	}
}