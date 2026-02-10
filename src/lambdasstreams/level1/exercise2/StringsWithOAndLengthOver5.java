package lambdasstreams.level1.exercise2;

import java.util.List;

public class StringsWithOAndLengthOver5 {

    public static void main(String[] args) {

        List<String> strings = List.of("abcd", "abcdo", "oooooooo", "boomer");

        System.out.println(stringsWithOAndLengthOver5(strings));
    }

    public static List<String> stringsWithOAndLengthOver5(List<String> list) {
        return list.stream()
                .filter(s -> s.contains("o") && s.length() > 5)
                .toList();
    }

}