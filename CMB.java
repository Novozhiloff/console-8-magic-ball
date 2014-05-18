public class CMB {
	public static void main(String[] args) {
		String[] answers = {"It is certain", "without a doubt",
		 "You may rely on it", "As I see it, yes", "Most likely",
		 "Sings point to yes", "Reply hazy, try again", "Ask again later",
		 "Cannot predict now", "Don't count on it", "My reply is no", 
		 "Very doubtful"};
	int anslength = answers.length;
	int rand = (int) (Math.random() * anslength);
	String answer = answers[rand];
	System.out.println("My answer is " + answer);
	}
}
