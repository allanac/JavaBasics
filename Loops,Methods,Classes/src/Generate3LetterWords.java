import java.util.Scanner ;
public class Generate3LetterWords {

	 public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         char[] inputString = input.next().toCharArray();
         input.close();
         if (inputString.length == 1) {
                 System.out.println(inputString[0]+""+inputString[0]+""+inputString[0]);

         } else {
                 for (int i = 0; i < inputString.length; i++) {
                         for (int j = 0; j < inputString.length; j++) {
                                 for (int k = 0; k < inputString.length; k++) {
                                         System.out.print(inputString[i]+""+inputString[j]+""+inputString[k]);
                                         System.out.print(" ");
                                 }
                         }
                 }
         }

 }
		
		

	

}
