import java.util.Arrays;


/* TO-DO:

	- Pass unsorted array
	- Perform algorithm
	- Return sorted array
	- Overload methods. Templating better. 
	

*/

public class InsertionSort {
	
	public static int[] sortArray (int[] arr){
		
		System.out.println("Sorting...");
		int index = 0;
		
		for (int i = 0; i < arr.length; i++){
			// select item
			// compare with next
			//tempValue = arr[i];

			index = i;
			int currentValue = arr[i];
			
			while (--index >= 0 && currentValue <= arr[index]) {
				arr = swap(arr, index, index+1);
			}
		}
		
		return arr;
	
	}
	// Modularizing code.
	private static int[] swap(int[] arr, int pos1, int pos2) {
		
		int temp;
		temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
		
		return arr;
	}



}