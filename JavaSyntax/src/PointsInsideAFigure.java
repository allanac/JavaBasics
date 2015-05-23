import java.util.Scanner ;
public class PointsInsideAFigure {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in) ;
		double x = input.nextDouble() ;
		double y = input.nextDouble() ;
		boolean firstPart = (x>=12.5 && x<=22.5 && y>=6 && y<=8.5);
		boolean secondPart =(x>=12.5 && x<=17.5 && y>=8.5 && y<=13.5) ;
		boolean thirdPart = (x>=20 && x<=22.5 && y>=8.5 && y<=13.5) ;
		if(firstPart ||(secondPart|| thirdPart)) {
			System.out.println("Insite");
		}
		else
		{
			System.out.println("Outsine");
		}

	}

}
