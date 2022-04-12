package extreme.fizzbuzz;

/**
 * @author wangqilin
 */
public class FizzBuzzConverter {
    public static final int FIZZ_NUM = 3;
    public static final int BUZZ_NUM = 5;
    public static final int WHIZZ_NUM = 7;
    public static final String FIZZ_STRING = "Fizz";
    public static final String BUZZ_STRING = "Buzz";
    public static final String WHIZZ_STRING = "Whizz";

    public static String say(int number) {
        String result = "";

        if (isModByNumber(number, FIZZ_NUM)) {
            result += FIZZ_STRING;
        }
        if (isModByNumber(number, BUZZ_NUM)) {
            result += BUZZ_STRING;
        }
        if (isModByNumber(number, WHIZZ_NUM)) {
            result += WHIZZ_STRING;
        }
        if (result.isEmpty()) {
            result += number;
        }
        return result;
    }

    private static boolean isModByNumber(int target, int divisor) {
        return target % divisor == 0;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ":" + say(i));
        }
    }
}
