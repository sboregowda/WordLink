package finder;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class WordList {

	public void showWords(List<String> dictionary, List<String> alphabets, int letterLength) {
		
		List<String> requiredLength = new ArrayList<String>();
		List<String> finalList = new ArrayList<String>();
		
		//String data[] = letterInput.split(" ");
		
		//for (int i=0;i<data.length; i++){
			//System.out.println(data[i]);
		//}
		
		//Iterator<String> lengthIterator = dictionary.iterator();
		//while(lengthIterator.hasNext()){
			//if(lengthIterator.next().length() == letterLength){
				//requiredLength.add(lengthIterator.next());
			//}
		//}
		
		for(int i = 0; i<dictionary.size(); i++){
			
			if(dictionary.get(i).length()==letterLength){
				
				requiredLength.add(dictionary.get(i));
				
			}
		}
		
		for(int i=0; i<requiredLength.size(); i++){
			
			boolean flag = true;
			
			for(int j=0; j<alphabets.size(); j++){
				
				if((requiredLength.get(i).contains(alphabets.get(j))))
				{
					flag = false;
					
					//finalList.add(requiredLength.get(i));
				//	finalList.remove(i);
				//	System.out.println(finalList.size());
				}
				
			}
			
			if(flag)
			{
				finalList.add(requiredLength.get(i));
			}
			
		}
		
		
		for (int i=0;i<finalList.size(); i++){
			System.out.println(finalList.get(i));
			//System.out.println(dictionary.size());
			//System.out.println(requiredLength.size());
			//System.out.println(finalList.size());
		}
		
		//System.out.println(dictionary.size());
		//System.out.println(requiredLength.size());
		//System.out.println(finalList.size());
		//System.out.println(alphabets.size());
		
		
	}

}
