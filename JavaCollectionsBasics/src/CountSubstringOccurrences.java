import java.util.Scanner;
public class CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		String line = scan.nextLine() ;
		String[] array = line.split("\\W") ;
		String word = scan.nextLine();
		scan.close();
		 int counter = 0 ;
		 int start = 0 ;
		 int end  = word.length()  ;
		 for (int i = 0 ; i<array.length; i++)
		 {  
			 if(array[i].length() >= word.length()){
			 while(end != array[i].length() + 1){
				 
					 if( new String( (array[i].substring(start, end)).toUpperCase()).equals( word.toUpperCase())){
						 counter++ ;
					
					 }
				 
				start++ ;
				end++ ; 
			 }
			 start = 0 ;
			 end = word.length() ;
			 }
		 }
		 System.out.println(counter);

	}

}

