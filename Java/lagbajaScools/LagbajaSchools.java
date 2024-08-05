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
			System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>>...");
			System.out.println("Successfully saved");
			System.out.println("===================================\n");
			System.out.println();
		}
		
		
		// sum up scores
		int [] sumOfScores = ArrayFunctions.addNumbersInList(gradeCollection);

		// Average of scores
		double [] averageOfScores = ArrayFunctions.averageOfNumbersInAList(sumOfScores);

		//print the result in tabular form

		System.out.println("=============================================");

		System.out.print("STUDENTS \t");
		for(int counter = 0; counter < subjectTheyOffer; counter++){
			System.out.printf("SUB%d \t", (counter+1));
		}
		System.out.print("TOT \t AVE\n");
		System.out.println("=============================================");
		
		for(int index = 0; index < numberOfStudent; index++){
			System.out.print("Student \t", (index+1));
			
			for(int scores : gradeCollection[numberOfStudent]){
				System.out.println(gradeCollection)
			}
			System.out.println();
		}


		
	}
}