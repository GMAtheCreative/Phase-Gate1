public class MenstralCycleCalculator{
	public String menstralCycle(int day, int month, int year, int cycle){
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

		String date = String.format("%d/%d/%d", newDay, month, year);

		return date;
	}
}