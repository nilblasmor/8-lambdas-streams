package lambdasstreams.level1.exercise3;

import java.util.List;

public class Months {

    public static void main(String[] args) {

        List<String> months = List.of(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        );

        months.forEach(m -> System.out.println(m));
    }

}