public class ArrayFunctions{
	
	public static int[] addNumbersInList(int [][] numbers){
		
		int []sumOfAList =new int [numbers.length];
		for(int index = 0; index < numbers.length; index++){
			int sum = 0;

			for(int scores : numbers[index]){
				sum += scores;

			}
			sumOfAList[index] = sum;
		}
		return sumOfAList;
	}

	public static double[] averageOfNumbersInAList(int [] numbers){
		
		
		int [] averageOfList = new int[numbers.length];

		for(int index = 0; index < numbers.length; index++){
			int amountOfNumbers = 0;
			for(int value : numbers){
				amountOfNumbers = value + 1;
			}
			averageOfList = numbers[index / amountOfNumbers];
		}
		return averageOfList;
	}


}