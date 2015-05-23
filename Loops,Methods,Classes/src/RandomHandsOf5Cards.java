import java.util.Scanner ;
import java.util.Random ;

public class RandomHandsOf5Cards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		int n = input.nextInt() ;
		input.close();
		String[] cards = {"2","3","4","5","6","7","8","9","10","A","Q","K","J"} ;
		String[] suits = {"\u2660","\u2663","\u2665", "\u2666"};
		
		for(int i = 0 ; i<n ;i++){
			for(int j=0 ; j<5 ; j++){
				Random randCards = new Random();
				Random randSuits = new Random();
				int cardRand = randCards.nextInt(13);
				int suitRand = randSuits.nextInt(4);
				
				System.out.print(cards[cardRand] + "" + suits[suitRand]);
				System.out.print(" ");
				
			}
			System.out.println("");
		}
	
		
	

	}

}

