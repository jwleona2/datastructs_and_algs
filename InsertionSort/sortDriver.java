import java.util.Arrays;
import java.util.Random;

public class sortDriver {

	private static int[] unsortedArray = new int[10];

	public static void main (String[] args) {
	
		/* TO-DO: 
			- Add ability to press Enter and generate/sort new array.
		*/
		
		Random rand = new Random();
		
		for(int i = 0; i < unsortedArray.length; i++){
			
			unsortedArray[i] = rand.nextInt(10);
			System.out.print(unsortedArray[i] + " ");

		}
		System.out.println();
		
		int[] sortedArr = InsertionSort.sortArray(unsortedArray);
		printResult(sortedArr);
	}
	
	public static void printResult(int[] arr) {
		
		for(int i = 0; i < arr.length; i++){
			
			System.out.print(arr[i] + " ");

		}		
	}
}