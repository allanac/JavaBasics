import java.text.DecimalFormat;
import java.util.Scanner ;

public class FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		int a = input.nextInt() ; 
		double b = input.nextDouble() ;
		double c = input.nextDouble() ;
		
		String aInHex = Integer.toHexString(a) ;
		System.out.println(aInHex);
		System.out.println(Integer.toBinaryString(a));
		
		DecimalFormat f = new DecimalFormat("##.00") ;
		System.out.println(f.format(b));
		
		DecimalFormat m = new DecimalFormat("##.000") ;
		System.out.println(m.format(c));
	}

}
