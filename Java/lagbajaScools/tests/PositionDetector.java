public class PositionDetector{
	public int[] getPosition(int [] number){

		int[] position = new int[number.length];
		
		for(int index = 0; index < number.length; index++){
			for(int value = index+1; value < number.length; value++){
				if(number[index] > number[value]){
					positions[index] = 1 
				}
			}
		}
	}	
}