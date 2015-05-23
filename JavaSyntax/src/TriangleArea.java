import java.util.Scanner ;
public class TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		
		double Ax = input.nextDouble() ;
		double Ay=input.nextDouble() ;
		
		double Bx = input.nextDouble() ;
		double By = input.nextDouble() ;
		
		double Cx = input.nextDouble() ;
		double Cy = input.nextDouble() ;
		
		double area ;
		double ac = Math.sqrt((Ax-Cx)*(Ax-Cx) + (Ay-Cy)*(Ay-Cy)) ;
		double bc = Math.sqrt((Bx-Cx)*(Bx-Cx) + (By-Cy)*(By-Cy)) ;
		double ab = Math.sqrt((Ax-Bx)*(Ax-Bx) + (Ay-By)*(Ay-By)) ;
		
		if(ac<(bc+ab) && bc<(ac+ab) && ab<(ac+bc)){
			area =Math.abs(((Ax*(By-Cy) + Bx*(Cy-Ay) + Cx*(Ay-By))/2));
			System.out.println(area);
		}
		else
		{
			System.out.println("0");
		}
		
		
	}

}
