
public class Lab2B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Student info
		System.out.println("Programmer: Isam Nagi\r\n" + 
		"Course: COSC 211, Summer 2020\r\n" + 
		"Lab#: 2A\r\n" + 
		"Due date: 7-01-2020");
		
		//Reads in line of text
		System.out.println("Please enter a sentince: ");
		String sentence = in.nextLine();
		
		//Display size of string
		System.out.println("Number of characters: " + sentence.length());
		
		//Display number of words
		String[] numWords = sentence.split("\\s");
		System.out.println("Number of words: " + numWords.length);
		
		//Display Longest word in sentence
		
		System.out.println("Number of words: " + longestWord(numWords));
		
		//
		

	}
	
	
	public static String longestWord(String [] a){
		String longestWord = "";
		for(int i = 0; i < a.length; i++){
			if(a[i].length() > longestWord.length())
				longestWord = a[i];
		}
		return longestWord;
	}	

}
