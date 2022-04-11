package extreme.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
    void should_return_FizzBuzz_when_say_given_number_is_only_mod_by_3_5_and_not_contain_3_5_7() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(60);
        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    void should_return_FizzWhizz_when_say_given_number_is_only_mod_by_3_7_and_not_contain_3_5_7() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(21);
        Assertions.assertEquals("FizzWhizz", result);
    }

    @Test
    void should_return_BuzzWhizz_when_say_given_number_is_only_mod_by_5_7_and_not_contain_3_5_7() {
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

    @Test
    void should_return_Fizz_3_when_say_given_number_only_contain_3() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(3);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void should_return_Fizz_13_when_say_given_number_only_contain_3() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(13);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void should_return_Fizz_130_when_say_given_number_only_contain_3() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(130);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void should_return_Fizz_30_when_say_given_number_only_contain_3() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(30);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void should_return_BuzzWhizz_35_when_say_given_number_is_mod_by_5_7_and_contain_5() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(35);
        Assertions.assertEquals("BuzzWhizz", result);
    }

    @Test
    void should_return_Fizz_75_when_say_given_number_is_mod_by_3_5_and_contain_7() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(75);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void should_return_original_number_53_when_say_given_number_is_not_mod_by_3_5_7_and_contain_3_5() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(53);
        Assertions.assertEquals("53", result);
    }

    @Test
    void should_return_original_number_52_when_say_given_number_is_not_mod_by_3_5_7_and_contain_5() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(52);
        Assertions.assertEquals("52", result);
    }

    @Test
    void should_return_BuzzWhizz_245_when_say_given_number_is_mod_by_5_7_and_contain_5() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(245);
        Assertions.assertEquals("BuzzWhizz", result);
    }

    @Test
    void should_return_FizzWhizz_147_when_say_given_number_is_mod_by_3_7_and_only_contain_7() {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        String result = converter.say(147);
        Assertions.assertEquals("FizzWhizz", result);
    }
}
