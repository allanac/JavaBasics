import java.util.Scanner ;

public class RectangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double height = input.nextDouble() ;
		double weight = input.nextDouble() ;
		double area ;
		
		area = height*weight ;
		System.out.println(area);

	}

}
