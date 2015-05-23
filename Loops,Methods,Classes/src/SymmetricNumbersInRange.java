import java.util.Scanner ;
public class SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start = input.nextInt() ;
		int end = input.nextInt();
		input.close() ;
		for(int i=start ; i<=end ; i++)
		{
			int number = i ;
			int help = i%10;
			if(help == number){
				System.out.println(number);
			}
			else {
				while(number>=10){
					number = number/10 ;
					if(help == number){
					System.out.println(i);
				}
			}
			}
		}
	}
}
			
			
				
		
	

			

