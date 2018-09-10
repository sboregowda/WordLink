package finder;

//import java.io.BufferedReader;
import java.io.File;
//import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
	
	public List<String> fileData() throws Exception{
	
		Scanner s = new Scanner(new File("words_alpha.txt"));
		
		List<String> dictionary = new ArrayList<String>();
		
		while(s.hasNext()){
			dictionary.add(s.next());
		}
		
		
		//for (int i = 0; i < 11; i++) {
		//for (int i = 0; i < dictionary.size(); i++) {
			//System.out.println(dictionary.get(i));
		//}
		
		s.close();
		
		return dictionary;
		
	}
	
	public List<String> alphabetData(String letterInput) throws Exception{
		
		Scanner s = new Scanner(new File("alphabets.txt"));
		
		List<String> alphabets = new ArrayList<String>();
		
		while(s.hasNext()){
			alphabets.add(s.next());
		}
		
		//for (int i = 0; i < alphabets.size(); i++) {
			//System.out.println(alphabets.get(i));
		//}
		
		String data[] = letterInput.split(" ");
		
		for(int i=0;i<data.length;i++){
			
			for(int j=0;j<alphabets.size();j++){
				
				if(alphabets.get(j).contains(data[i]))
				{
					alphabets.remove(alphabets.get(j));
				}
				
			}
			
		}
		
		
		//for (int i = 0; i < alphabets.size(); i++) {
			//System.out.println(alphabets.get(i));
		//}
		
		s.close();
		
		return alphabets; //requiredAlphabets;
		
		
	}
	
	

}