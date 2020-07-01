
public class Lab2B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean key = true;
		
	do{	
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
		
		//Display Words in ascending order
		
		System.out.println("Words in ascending order: " + Arrays.sort(numWords));
		
		System.out.println("Do it again, yes (or no)?");
		String answer = in.nextLine();
		if(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y')
			key = true;
		else key = false;
	}
	while(key);
		
		
		

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
