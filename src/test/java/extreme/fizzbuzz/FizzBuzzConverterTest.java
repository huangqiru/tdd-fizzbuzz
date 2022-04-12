package extreme.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
Tasking:
Given 报数 1, not mod by 3,5,7, and not contain 3,5,7, when 打印 then 输出1
Given 报数 3, mod by 3, when 打印 then 输出 "Fizz"
Given 报数 5, mod by 5, when 打印 then 输出 "Buzz"
Given 报数 7, mod by 7, when 打印 then 输出 "Whizz"

Given 报数 60, mod by 3,5, and not contain 3,5,7, when 打印 then 输出 "FizzBuzz"
Given 报数 21, mod by 3,7, and not contain 3,5,7, when 打印 then 输出 "FizzWhizz"
Given 报数 140, mod by 5,7, and not contain 3,5,7, when 打印 then 输出 "BuzzWhizz"
Given 报数 210, mod by 3,5,7, and not contain 3,5,7,  when 打印 then 输出 "FizzBuzzWhizz"

包含3
Given 报数 13, no mod by 3,5,7 and contain 3, when 打印 then 输出 "FizzBuzz"
Given 报数 3, mod by 3, and contain 3,  when 打印 then 输出 "Fizz"
Given 报数 130, mod by 5, and contain 3,  when 打印 then 输出 "Fizz"
Given 报数 133, mod by 7, and contain 3, when 打印 then 输出 "Fizz"

包含5
Given 报数 15, mod by 3,5 and contain 5, when 打印 then 输出 "Buzz"
Given 报数 35, mod by 5,7, and contain 3,5,  when 打印 then 输出 "BuzzWhizz"
Given 报数 51, mod by 3, and contain 5,  when 打印 then 输出 "51"
Given 报数 133, mod by 7, and contain 3, when 打印 then 输出 "Whizz"

包含7
Given 报数 17, no mod by 3,5,7 and contain 7, when 打印 then 输出 "17"
Given 报数 7, mod by 7, and contain 7,  when 打印 then 输出 "Whizz"
Given 报数 73, no mod by 3,5,7 and contain 3,7,  when 打印 then 输出 "Fizz"
Given 报数 75, mod by 3,5, and contain 5,7, when 打印 then 输出 "Fizz"
Given 报数 170, mod by 5, and contain 7, when 打印 then 输出 "170"
Given 报数 357, mod by 3,7, and contain 3,5,7, when 打印 then 输出 "FizzWhizz"
 */
class FizzBuzzConverterTest {
    @Test
    void should_return_original_number_1_when_say_given_number_is_not_mod_by_3_5_7_and_not_contain_3_5_7() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(1);
        Assertions.assertEquals("1", result);
    }

    @Test
    void should_return_original_number_4_when_say_given_number_is_not_mod_by_3_5_7_and_not_contain_3_5_7() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(4);
        Assertions.assertEquals("4", result);
    }

    @Test
    void should_return_Fizz_when_say_given_number_is_only_mod_by_3_and_not_contain_3_5_7() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(6);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void should_return_Buzz_when_say_given_number_is_only_mod_by_5_and_not_contain_3_5_7() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(10);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    void should_return_Whizz_when_say_given_number_is_only_mod_by_7_and_not_contain_3_5_7() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(14);
        Assertions.assertEquals("Whizz", result);
    }

    @Test
    void should_return_FizzBuzz_when_say_given_number_is_mod_by_3_5_and_not_contain_3_5_7() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(60);
        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    void should_return_FizzWhizz_when_say_given_number_is_mod_by_3_7_and_not_contain_3_5_7() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(21);
        Assertions.assertEquals("FizzWhizz", result);
    }

    @Test
    void should_return_BuzzWhizz_when_say_given_number_is_mod_by_5_7_and_not_contain_3_5_7() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(140);
        Assertions.assertEquals("BuzzWhizz", result);
    }

    @Test
    void should_return_FizzBuzzWhizz_when_say_given_number_is_mod_by_3_5_7_and_not_contain_3_5_7() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(210);
        Assertions.assertEquals("FizzBuzzWhizz", result);
    }
}
