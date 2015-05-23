import java.util.Scanner;
import java.text.DecimalFormat;



public class AngleUnitConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfLines = input.nextInt();
		
		String singleMeasure;
		double singleNumber;
		
		String[] measures = new String[numberOfLines];
		double[] numbers = new double[numberOfLines];
		
		for (int i = 0; i < numberOfLines; i++) {
			
			singleNumber = input.nextDouble();
			singleMeasure = input.next();
			measures[i] = singleMeasure;
			numbers[i] = singleNumber;
			
		}
		
		
		
		for (int i = 0; i < numberOfLines; i++) {
				if(new String(measures[i]).equals("rad"))
				{
				measures[i] = "deg";
				numbers[i] = (numbers[i] * 180) / 3.141592;
				
				
				}
				else if(new String(measures[i]).equals("deg")){
					measures[i] = "rad";
					numbers[i] = (numbers[i] * 3.141592) / 180 ;
					
				}
			}
		DecimalFormat f = new DecimalFormat("##.000000") ;
		for (int j = 0; j < numberOfLines; j++) {
			System.out.print(f.format(numbers[j]));
			System.out.print(" ");
			System.out.print(measures[j]);
			System.out.println(" ");
		}
		input.close();
			
		}
		

	}