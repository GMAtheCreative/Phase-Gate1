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
		
		
		double [] averageOfList = new double[numbers.length];

		for(int index = 0; index < numbers.length; index++){
			averageOfList[index] = (double) numbers[index] / numbers.length;
		}
		return averageOfList;
	}


}