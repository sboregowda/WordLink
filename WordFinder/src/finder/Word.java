package finder;

import java.util.List;

public class Word {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		ReadFile rf = new ReadFile();
		List<String> dictionary = rf.fileData();
		
		
		InputData inputData = new InputData();
		
		String letterInput = inputData.userInput();
		int letterLength = inputData.inputLen();
		
		List<String> alphabets = rf.alphabetData(letterInput);
		
		WordList wordList = new WordList();
		
		wordList.showWords(dictionary, alphabets, letterLength);
		
		//for (int i = 0; i < 20; i++) {
			//System.out.println(dictionary.get(i));
			
		//}
		
		//System.out.println(letterInput);
		//System.out.println(letterLength);

	}


}
