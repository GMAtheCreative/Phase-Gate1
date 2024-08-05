import java.util.Scanner;
public class LagbajaSchools{
	public static void main(String... args){

		Scanner collect = new Scanner(System.in);

		System.out.println("How many student do you have?");
		int numberOfStudent = collect.nextInt();

		System.out.println("How many subject do they offer?");
		int subjectTheyOffer = collect.nextInt();

		System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>>...");
		System.out.println("Successfully saved");
		System.out.println("===================================\n");
		
		//Sore collecting
		int [][]gradeCollection = new int[numberOfStudent][subjectTheyOffer];
	
		for(int studentCounter = 0 ; studentCounter < numberOfStudent ; studentCounter++){
			System.out.println("Enter scores of student " + (studentCounter+1));

			for (int scoreCounter = 0; scoreCounter < subjectTheyOffer; scoreCounter++){

				gradeCollection[studentCounter][scoreCounter] = collect.nextInt();
			}
			System.out.println();
		}
		
		
		// sum up scores
		int [] sumOfScores = ArrayFunctions.addNumbersInList(gradeCollection);

		// Average of scores
		int [] averageOfScores = ArrayFunctions.averageOfNumbersInAList(sumOfScores);

		
	}
}