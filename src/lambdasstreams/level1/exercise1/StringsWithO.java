package lambdasstreams.level1.exercise1;

import java.util.List;

public class StringsWithO {

    public static void main(String[] args) {

        List<String> strings = List.of("ao", "bi", "co", "do");

        System.out.println(stringsWithO(strings));
    }

    public static List<String> stringsWithO(List<String> list) {
        return list.stream()
                .filter(s -> s.contains("o"))
                .toList();
    }

}