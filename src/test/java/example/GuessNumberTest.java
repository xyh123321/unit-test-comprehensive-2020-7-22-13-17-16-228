package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberTest {
    @Test
    void should_return_4A0B_when_guess_number_given_1234() {
        //given
        int[] answer = {1, 2, 3, 4};
        int[] inputNumber = {1, 2, 3, 4};
        GuessNumber guessNumber = new GuessNumber();

        //when
        String res = guessNumber.guess(inputNumber,answer);

        //then
        assertEquals("4A0B", res);
    }
}
