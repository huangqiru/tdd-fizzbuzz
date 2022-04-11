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
//
    public static String say(int number) {
        if (isContains(number, FIZZ_NUM) && !isContains(number, BUZZ_NUM)) {
            return FIZZ_STRING;
        }
        String result = "";
        if (isModByNumber(number, FIZZ_NUM) && (!isContains(number, BUZZ_NUM) || isContains(number, WHIZZ_NUM))) {
            result += FIZZ_STRING;
        }
        if (isModByNumber(number, BUZZ_NUM) && !isContains(number, WHIZZ_NUM)) {
            result += BUZZ_STRING;
        }
        if (isModByNumber(number, WHIZZ_NUM)) {
            result += WHIZZ_STRING;
        }
        return result.isEmpty() ? String.valueOf(number) : result;
    }

    private static boolean isContains(int number, int fizzNum) {
        return String.valueOf(number).contains(String.valueOf(fizzNum));
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
