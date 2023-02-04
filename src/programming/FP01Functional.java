package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(9,1,8,2,7,3,6,4,5,2,0,9,1);
		List<String> words = List.of("Spring", "Spring boot", "API", "Docker", "AWS", "GCP");
		
		printCharInWordListFunctional(words);
//		printAllWordsInListFunctional(words);
//		printSpringWordsInListFunctional(words);
//		printEvenNumsInListFunctional(numbers);
//		printSquareOddNumsInListFunctional(numbers);
	}

	private static void printCharInWordListFunctional(List<String> words) {

		words.stream().map(word -> word + " " + word.length()).forEach(System.out::println);
	}

	private static void printSpringWordsInListFunctional(List<String> words) {
		
		System.out.println();
		words.stream().filter(word -> word.contains("Spring")).forEach(System.out::println);
	}

	private static void printAllWordsInListFunctional(List<String> words) {

		words.stream().forEach(System.out::println);
	}

	private static void printEvenNumsInListFunctional(List<Integer> numbers) {

		//numbers.stream().forEach(FP01Functional::print);
		System.out.println();
		numbers.stream().filter(num -> num%2==0).forEach(System.out::println);
	}
	
	private static void printSquareOddNumsInListFunctional(List<Integer> numbers) {

		System.out.println();
		numbers.stream().filter(num -> num%2!=0).map(num -> num*num).forEach(System.out::println);
	}
}
