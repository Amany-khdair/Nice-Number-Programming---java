//1190728_Amany Khdair.
import java.util.Scanner;
//to check whether the number is a nice number and does not contain digit D. 
public class Nice {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//when the program runs,the following appears:
		System.out.println("please enter the right bound: ");
		int R = in.nextInt();
		System.out.println("please enter the left bound: ");
		int L = in.nextInt();
		System.out.println("please enter digit to exclude it: ");
		int D = in.nextInt();
		// print nice numbers in [R and L]
		NiceNumbers(R, L, D);
		//to close in (in scanner in)we put
		in.close();
	}

	public static void NiceNumbers(int R, int L, int D) {
		//to compare the entered values we use for loop
		for (int i = R; i <= L; i++) {
			// n is the last digit
			int sum = 0;
			boolean x = true;
			int n;
			//the entered number has been assigned a specific value which is here num
			int num = i;
			n = num % 10;
			sum = n;
			//if n was equal to the last digit then return
			if (n == D)
				x = false;
			//to separate the other digits, we use division
			num = num / 10;
			while (num > 0) {
				n = num % 10;
				//if n=digit or less than or equal to sum then return 
				if (n == D || n <= sum) {
					x = false;
				}
				//the new updates
				sum = sum + n;
				num = num / 10;
			}
			//All required numbers will appear by the following print sentence
			if (x) {
				System.out.println(i);
			}
		}
	}
}
                               //the end :)