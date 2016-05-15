import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Large sum
//		Problem 13
//		Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
		File file = new File("input.txt");
		try {
			Scanner input = new Scanner(file);
			BigInteger sum = BigInteger.ZERO;
			while(input.hasNextLine()){
				sum = sum.add(new BigInteger(input.nextLine()));
			}
			System.out.println(sum.toString().substring(0, 10));
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
