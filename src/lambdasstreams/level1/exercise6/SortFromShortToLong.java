package lambdasstreams.level1.exercise6;

import java.util.List;
import java.util.Comparator;

public class SortFromShortToLong {

    public static void main(String[] args) {

        List<Object> list = List.of("abcde", 34, "epsilon", "AHOO", 1000);

        list.stream()
                .filter(o -> o instanceof String)
                .map(o -> (String) o)
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }

}
