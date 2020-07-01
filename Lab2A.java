import java.util.*;
public class Lab2A {
	
		public static void main(String[] args) {
			
			//Student info
			System.out.println("Programmer: Isam Nagi\r\n" + 
					"Course: COSC 211, Summer 2020\r\n" + 
					"Lab#: 2A\r\n" + 
					"Due date: 7-01-2020");
			
			//Loop to test each number if prime 
			for( int i = 2; i<=31; i++) {
				for (int j = 2; j<= i; j++) {
					if(i % j == 0) {
						if(mersenne(i)) {
							System.out.println(i + "\t" + ((int)Math.pow(2,i)-1));
						}
						
					}
					
				}
			}
	
		}
	
		
	public static boolean mersenne(int num){
	
		int merseeneNum= (int) (Math.pow(2,num) - 1);
		for (int j = 2; j<= merseeneNum/2; j++) {
			if(merseeneNum % j == 0) {
				return false;
			}
		}
		return true;
	
		
	}
}
