package codewarsLargeFactorials;

public class LargeFactorial {
	
	static String factorial(int n) {
		int answerAsInt = 1;
		for (int i = 2; i <= n; i++) {
			answerAsInt = answerAsInt * i; 
		}
		return Integer.toString(answerAsInt);
	}
	
}
