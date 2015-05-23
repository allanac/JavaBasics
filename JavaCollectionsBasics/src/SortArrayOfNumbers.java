
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner ;
public class SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		int n = input.nextInt() ;
		int[] a = new int[n] ;
		for(int i = 0 ; i<n ; i++){
			a[i] = input.nextInt() ;
			
		}
		
		Arrays.sort(a) ;
		for(int i = 0 ; i<a.length ; i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
