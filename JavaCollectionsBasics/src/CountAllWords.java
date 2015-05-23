import java.util.Scanner ;
public class CountAllWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		String line = scan.nextLine() ;
		String[] array = line.split("\\W") ;
		System.out.println(array.length);

	}

}
