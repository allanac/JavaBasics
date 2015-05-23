import java.util.Arrays;
import java.util.Scanner ;

public class SortArrayOfStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		
		int n = input.nextInt() ;
		String[] array = new String[n] ;
		String inputString;
		for(int i=0 ; i<n ; i++)
		{
			inputString = input.next() ;
			array[i] = inputString;
		}
		Arrays.sort(array) ;
		for(int i = 0 ; i<n ; i++)
		{
			System.out.println(array[i]) ;
		}
		

	}

}
