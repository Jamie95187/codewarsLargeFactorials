package codewarsLargeFactorials;

public class LargeFactorial {
	
	static String factorial(int n) {
		int res[] = new int[500];
		
		res[0] = 1;
		int res_size = 1;
		
		for (int x = 2; x <= n; x++) {
			res_size = multiply(x, res, res_size);
		}
		
		String ans = "";
		for (int i = res_size - 1; i >= 0; i--) {
			ans = ans + Integer.toString(res[i]);
		}
		
		return ans;
	}
	
	// number is the number to be multiplied with
	// res[] is the previous factorial; for example if 5! = 120 then res[] = {0, 2, 1}
	// res_size is the size of the res[] array, for example for res[] = {0, 2, 1} the res_sise = 3.
	// returns the res_size
	static int multiply(int number, int res[], int res_size) {
		{
			int carry = 0;
			
			// Multiply each digit in res[] by the number to be multiplied
			for(int i = 0; i < res_size; i++) {
				int prod = res[i] * number + carry;
				res[i] = prod % 10; // Store last digit of prod in res[]
				carry = prod/10; // Carry is what is carried through to the next element in res[]
//				System.out.println("Number ------- " + number);
//				System.out.println("Index ------ " + i + " : " + "product = " + prod);
			}
			
			// Put carry in res and increase result size
			while (carry !=0 ) {
				res[res_size] = carry % 10;
				carry = carry / 10;
				res_size++;
			}
			return res_size;
		}
	}
}
