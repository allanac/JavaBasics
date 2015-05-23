import java.util.Scanner ;
public class DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in) ;
		int number = input.nextInt() ;
		String result = Integer.toHexString(number) ;
		System.out.println(result);

	}

}
