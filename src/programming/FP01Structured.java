package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {

		printAllNumsInListStructured(List.of(9,1,8,2,7,3,6,4,5,2,0,9,1));
	}

	private static void printAllNumsInListStructured(List<Integer> numbers) {

		for(int num : numbers) {
			System.out.print(num);
		}
	}
}
