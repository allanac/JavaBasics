import java.util.Scanner ;
public class CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		String line = scan.nextLine() ;
		String[] array = line.split("\\W") ;
		String word = scan.nextLine() ;
		 int counter = 0 ;
		for(int i = 0 ; i<array.length ; i++)
		{
			if(array[i].equals(word))
			{
				counter++ ;
			}
		}
		System.out.println(counter);

	}

}
