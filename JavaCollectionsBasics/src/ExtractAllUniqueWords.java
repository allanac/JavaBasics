import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		String[] text = scan.nextLine().toLowerCase().split("\\W+") ;
		Set<String> set = new TreeSet<>() ;
		for (String symbol : text) {
			set.add(symbol);
		}
		for(String symbol : set){
			System.out.print(symbol+ " ");
		}

	}

}
