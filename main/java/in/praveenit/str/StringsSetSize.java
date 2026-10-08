package in.praveenit.str;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringsSetSize {
	public static void main(String[] args) {

		List<String> words = Arrays.asList("Banana","Banana", "Mango", "Apple", "Kiwi");
		Integer size = words.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Set::size));
		System.out.println(size);

	}
}
