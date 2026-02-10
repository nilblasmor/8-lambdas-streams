package lambdasstreams.level1.exercise7;

import java.util.Comparator;
import java.util.List;

public class SortFromLongToShort {

    public static void main(String[] args) {

        List<Object> list = List.of("abcde", 34, "epsilon", "AHOO", 1000);

        list.stream()
                .filter(o -> o instanceof String)
                .map(o -> (String) o)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .forEach(System.out::println);
    }

}
