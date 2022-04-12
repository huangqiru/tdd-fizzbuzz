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

        if (isContainFizzNum(number) && !isContainBUZZ_NUM(number)) {
            return FIZZ_STRING;
        }

        if (isModByFIZZ_NUM(number) && (!isContainBUZZ_NUM(number) || isContainBUZZ_NUM_AND_WHIZZ_NUM(number))) {
            result += FIZZ_STRING;
        }
        if (isModByBUZZ_NUM(number) && !isContainWHIZZ_NUM(number)) {
            result += BUZZ_STRING;
        }
        if (isModByWHIZZ_NUM(number)) {
            result += WHIZZ_STRING;
        }

        if (result.isEmpty()) {
            result += number;
        }
        return result;
    }

    private static boolean isContainBUZZ_NUM_AND_WHIZZ_NUM(int number) {
        return isContainBUZZ_NUM(number) && isContainWHIZZ_NUM(number);
    }

    private static boolean isModByFIZZ_NUM(int number) {
        return isModByNumber(number, FIZZ_NUM);
    }

    private static boolean isModByBUZZ_NUM(int number) {
        return isModByNumber(number, BUZZ_NUM);
    }

    private static boolean isModByWHIZZ_NUM(int number) {
        return isModByNumber(number, WHIZZ_NUM);
    }

    private static boolean isContainFizzNum(int number) {
        return isContainTargetNumber(number, FIZZ_NUM);
    }

    private static boolean isContainBUZZ_NUM(int number) {
        return isContainTargetNumber(number, BUZZ_NUM);
    }

    private static boolean isContainWHIZZ_NUM(int number) {
        return isContainTargetNumber(number, WHIZZ_NUM);
    }

    private static boolean isContainTargetNumber(int number, int targetNumber) {
        return String.valueOf(number).contains(String.valueOf(targetNumber));
    }

    private static boolean isModByNumber(int target, int divisor) {
        return target % divisor == 0;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i + ":" + say(i));
        }
    }
}
