import java.util.Scanner ;
public class LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		String line = scan.nextLine();
		String[] array = line.split(" ") ;
		int[] nums = new int[array.length] ;
		int[] help = new int[array.length] ;
		int maxLength  = 0 ;
		int currLength = 1 ;
		int end = 0 ;
		for(int i = 0 ; i <nums.length ; i++)
		{
			nums[i] = Integer.parseInt(array[i]) ;
		}
		int i ;
		for(i=0 ; i<nums.length - 1 ; i++){
			
			if(nums[i] < nums[i+1]){
				currLength++ ;
				System.out.print(nums[i] + " ");
			}
			else 
			{
				System.out.print(nums[i] + " ");
				System.out.println();
				if(maxLength<currLength){
					maxLength=currLength;
					end = i ;
				}
				currLength = 1 ;
				
			}
			
			
		}
			System.out.print(nums[i]);
			if(maxLength<currLength){
				maxLength=currLength;
				end = i  ;
			}
			
		
		int start = end -maxLength + 1;
		//System.out.println("Start: " + start);
		//System.out.println("End: " + end);
		System.out.println();
		System.out.print("Longest: ");
		for(i=start; i<=end ; i++){
			System.out.print(nums[i]+ " ");
		}
			
	}

}
