package practicecodes;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CharFrequency {

    //String inputString = "Devashree";

    public static void main(String[] args) {
        String input = "Devashreeee";

        Map<String, Long> result = outputWords(input);

        System.out.println(result);
    }

    public static Map<String, Long> outputWords(String input) {
        return Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
    }
}
