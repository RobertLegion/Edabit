package EzyQ;

public class CompareStringsByCountOfCharacters {
    public static void main(String[] args) {
        System.out.println(comp("AB", "CD"));
        System.out.println(comp("abdcd", "abbbccccc"));
    }

    public static boolean comp(String str1, String str2) {
        int a = str1.length();
        int b = str2.length();

        if (a == b) {
            return true;
        } else return false;
    }
}

