package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuessNumberTest {
    @Test
    void should_return_4A0B_when_guess_number_given_1234() {
        //given
        int[] inputNumber = {1, 2, 3, 4};
        int[] answer = {1, 2, 3, 4};

        GuessNumber guessNumber = new GuessNumber(answer);

        //when
        String res = guessNumber.guess(inputNumber);

        //then
        assertEquals("4A0B", res);
    }

    @Test
    void should_return_0A4B_when_guess_number_given_4321() {
        //given
        int[] inputNumber = {4, 3, 2, 1};
        int[] answer = {1, 2, 3, 4};
        GuessNumber guessNumber = new GuessNumber(answer);

        //when
        String res = guessNumber.guess(inputNumber);

        //then
        assertEquals("0A4B", res);
    }

    @Test
    void should_return_0A0B_when_guess_number_given_5678() {
        //given
        int[] inputNumber = {5, 6, 7, 8};
        int[] answer = {1, 2, 3, 4};
        GuessNumber guessNumber = new GuessNumber(answer);

        //when
        String res = guessNumber.guess(inputNumber);

        //then
        assertEquals("0A0B", res);
    }

    @Test
    void should_return_2A2B_when_guess_number_given_1243() {
        //given
        int[] inputNumber = {1, 2, 4, 3};
        int[] answer = {1, 2, 3, 4};
        GuessNumber guessNumber = new GuessNumber(answer);

        //when
        String res = guessNumber.guess(inputNumber);

        //then
        assertEquals("2A2B", res);
    }

    @Test
    void should_return_1A1B_when_guess_number_given_1359() {
        //given
        int[] inputNumber = {1, 3, 5, 9};
        int[] answer = {1, 2, 3, 4};
        GuessNumber guessNumber = new GuessNumber(answer);

        //when
        String res = guessNumber.guess(inputNumber);

        //then
        assertEquals("1A1B", res);
    }

    @Test
    void should_return_0A2B_when_guess_number_given_1234() {
        //given
        int[] inputNumber = {2, 1, 6, 8};
        int[] answer = {1, 2, 3, 4};
        GuessNumber guessNumber = new GuessNumber(answer);

        //when
        String res = guessNumber.guess(inputNumber);

        //then
        assertEquals("0A2B", res);
    }

    @Test
    void should_return_true_when_valid_inputnumber_given_2168() {
        //given
        int[] inputNumber = {2, 1, 6, 8};

        //when
        boolean res = AnswerValidator.isLegal(inputNumber);

        //then
        assertTrue(res);
    }

    @Test
    void should_return_true_when_generator_answer_given_valid_answer() {
        //given
        AnswerGenerator generatorAnswer = new AnswerGenerator();
        int[] answer = generatorAnswer.generatorAnswer();

        //when
        boolean res = AnswerValidator.isLegal(answer);

        //then
        assertTrue(res);
    }


}
