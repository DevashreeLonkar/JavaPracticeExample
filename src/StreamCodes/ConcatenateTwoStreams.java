package StreamCodes;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 42 Concatenate 2 streams

public class ConcatenateTwoStreams {

	public static void main(String[] args) {
		Stream<String> stream1= Stream.of("Java", "Python");
		Stream<String> stream2= Stream.of("CPP", "JavaScript");

		Stream<String> concatenatedStream= Stream.concat(stream1, stream2);
		concatenatedStream.forEach(System.out::println);
	}

}
