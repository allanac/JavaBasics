import java.util.Scanner;
import java.util.Arrays;


public class SequencesOfEqualStrings {

	 public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in) ;
			String lines = scan.nextLine() ;
			String[] array = lines.split(" ") ;
			//System.out.print(array[0]);
			int i = 0 ;
			for( i =0 ; i<array.length - 1 ; i++)
			{
				if(!array[i].equals(array[i+1])){
					System.out.println(array[i]);
				}
				else
				{
					//System.out.println();
					System.out.print(array[i] + " ");
				}
			}
			if(array[i - 1].equals(array[i])){
				
			System.out.print(array[i]);
			}
			else
			{
				System.out.println(array[i]);
			}
		

	 }

}
