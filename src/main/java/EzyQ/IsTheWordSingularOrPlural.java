package EzyQ;

public class IsTheWordSingularOrPlural {
    public static void main(String[] args) {
        System.out.println(isPlural("dockers"));
        System.out.println(isPlural("docker"));
        System.out.println(isPlural("boys"));
        System.out.println(isPlural("boy"));
    }

    public static boolean isPlural(String word) {
        if (word.endsWith("s")) {
            return true;
        } else return false;
            //endsWith() - sprawdza ostatnia litere //
    }
}

