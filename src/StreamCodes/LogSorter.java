package StreamCodes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// 55 Reorder message from format in chronological order

public class LogSorter {

	public static void main(String[] args) {
		List<String> logs = Arrays.asList(
	            "14:30:3:Server started",
	            "14:30:1:User logged in",
	            "14:29:2:Database connected",
	            "18:32:4:User logged out"
	        );

	        List<String> sortedMessages = logs.stream()
	            .sorted(Comparator.comparing(log -> {
	                // Extract the sortable timestamp as HH:MM:ID
	                String[] parts = log.split(":", 4);
	                return String.format("%02d:%02d:%02d",
	                        Integer.parseInt(parts[0]),
	                        Integer.parseInt(parts[1]),
	                        Integer.parseInt(parts[2]));
	            }))
	            .map(log -> log.split(":", 4)[3]) // extract only the message
	            .collect(Collectors.toList());

	        // Print result
	        sortedMessages.forEach(System.out::println);

	}

}
