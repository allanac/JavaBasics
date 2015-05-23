
import java.util.Scanner;
import java.util.regex.*;

public class ExtractEmails {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		input.close();
		
		
		Pattern emailPattern = Pattern.compile("[.-_]*[a-zA-Z]*[.-_]*[0-9]*[a-zA-Z]*\\@[a-zA-Z]+[-]*[a-zA-Z]*\\.[a-zA-Z]*[.]*[a-zA-Z]+[-]*[a-zA-Z][.]*");
		
		Matcher matcher = emailPattern.matcher(text);
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		
		
	}

}