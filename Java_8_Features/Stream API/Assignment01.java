import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 8, -4, 2, -5, -6));
		ArrayList<Integer> res = (ArrayList<Integer>) list.stream().filter(x -> (x < 0 && x % 2 == 0)).collect(Collectors.toList());
		System.out.println(res);
	}

}
