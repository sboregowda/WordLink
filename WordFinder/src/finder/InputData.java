package finder;

import java.util.Scanner;

public class InputData {
	
	Scanner input = new Scanner(System.in);
	
	
	public String userInput() {
		
		String data = input.nextLine();
		
		return data;
		
	}
	
	public int inputLen() {
		
		int inputLen = input.nextInt();
		
		return inputLen;
		
	}

}
