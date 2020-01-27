package EzyQ;

public class IsTheNumberEvenOrOdd {

    public static void main(String[] args) {
        System.out.println(isEvenOrOdd(4));
        System.out.println(isEvenOrOdd(5));
        System.out.println(isEvenOrOdd(7));
    }

    public static String isEvenOrOdd(int num) {
        String str;
        if(num % 2 == 0){
            return str = "even";
        } else return str = "odd";
    }
}
