import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenstralApp{
	public static void main(String[] args) {
        	Scanner collect = new Scanner(System.in);

		//without using the java date function

		System.out.println("Enter cycle lenght:");
		int cycle = collect.nextInt();
		System.out.println("Enter date you last saw your flow (day):");
		int day = collect.nextInt();

		System.out.println("Enter date you last saw your flow (month):");
		int month = collect.nextInt();

		System.out.println("Enter date you last saw your flow (Year):");
		int year = collect.nextInt();

		int newDay = day + cycle;
		int newMonth = month;
		int newYear = year;

		if (newDay > 31){
			newDay -= 31;
			newMonth += 1;

			if(newMonth > 12){
				newMonth -= 12;
				newYear += 1;
			}
		}

		System.out.println("Your next menstration is (DD/MM/YYYY) "+ newDay + "/"+ newMonth +"/"+ newYear);

		System.out.println("======================================================================");




		//using the java local date function

		System.out.println("Enter the previous cycle length in days:");
		int cycleLength = collect.nextInt();

		System.out.println("How many days does your flow takes on a average:");
		int flowDays = collect.nextInt();

		System.out.println("Enter the date of your last cycle (dd/MM/yyyy)");
		String lastCycle = collect.next();

		DateTimeFormatter menstralDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate lastCycleDate = LocalDate.parse(lastCycle, menstralDateFormat);

		int newCycle =cycleLength - flowDays;
		
		LocalDate nextPeriod = lastCycleDate.plusDays(newCycle);
		LocalDate ovulationPerion = nextPeriod.minusDays(14);
		
		System.out.println("Your next menstration is "+ nextPeriod + " Your ovulation period is " + ovulationPerion);

	}
}