import java.util.*;

public class PaperDriver{
	
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		ArrayList<Paper> a1 = new ArrayList<Paper>();
	
		Paper p0 = new Paper("this");
		Paper p1 = new Paper("that");
		Paper p2 = new Paper("hello");
		Paper p3 = new Paper("hi");
			
		String userInput;
		
		for(int i=0;i<4;i++){
			System.out.println("Add a sheet of paper");
			userInput = scan.nextLine();
			a1.add(new Paper(userInput));
		}
	
		while(true){
			String dummy;
			System.out.println("Press Enter to read next paper in the stack.");
			dummy = scan.nextLine(); // Upon presisng enter, readPaperStack will be called. 
			readPaperStack(a1);
		}
		
		// Read ArrayList (Reads LAST index. Afterward, moves it to the first and shifts the rest up)
		// Implement a stack,.
		// Add popped value to the beginning of the stack
	}
		

	public static void readPaperStack(ArrayList<Paper> a1){
		
		Paper temp;
		int lastIndex = a1.size()-1;
		System.out.println(a1.get(lastIndex).getText());
		Paper lastPaper = a1.get(lastIndex);
		a1.add(0,lastPaper);
		a1.remove(a1.size()-1);
	}
	
}