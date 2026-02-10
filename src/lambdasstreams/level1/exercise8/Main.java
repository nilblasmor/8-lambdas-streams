package lambdasstreams.level1.exercise8;

public class Main {

    public static void main(String[] args) {

        Reverse r = s -> new StringBuilder(s).reverse().toString();
        System.out.println(r.reverse("xyz"));
    }

}

