package in.praveenit.str;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepetedChar {
	public static void main(String[] args) {
		String s = "Hi Hello Enjoy";
		Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.print(entry.getKey() + ":" + entry.getValue()));
	}

}
