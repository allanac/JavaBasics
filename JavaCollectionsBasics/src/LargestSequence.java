import java.util.Scanner ;
public class LargestSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		String line = scan.nextLine() ;
		String[] array = line.split(" ") ;
		int maxLength = 1 ; 
		int currLength = 1 ;
		int i = 0 ;
		String symbol = array[0] ;
		for( i =0 ; i<array.length-1 ; i++){
			if(array[i].equals(array[i+1]))
			{
				currLength++ ;
			}
			else
			{
				
				if(currLength>maxLength)
				{
					maxLength = currLength ;
					symbol = array[i] ;
					
				}
				currLength = 1 ;
						
				
			}
		}
		
			if(currLength>maxLength)
			{
				maxLength = currLength ;
				symbol = array[i] ;
				
			}
			for(int j = 0 ; j<maxLength ; j++){
				
			System.out.print(symbol+ " ");
			}
		
			
		//System.out.println(maxLength);
		

	}

}
