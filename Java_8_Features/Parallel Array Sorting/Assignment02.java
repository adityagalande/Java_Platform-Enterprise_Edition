import java.util.Arrays;
import java.util.Scanner;

public class Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = scan.next();
		char[] array = str.toCharArray();
		Arrays.parallelSort(array);
		str = new String(array);
		System.out.println(str);
	}

}
