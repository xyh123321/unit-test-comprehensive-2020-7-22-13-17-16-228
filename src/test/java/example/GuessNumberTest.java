package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessNumberTest {
    @Test
    void should_return_4A0B_when_guess_number_given_1234() {
        //given
        int[] inputNumber = {1, 2, 3, 4};
        int[] answer = {1, 2, 3, 4};
        GeneratorAnswer generatorAnswer = mock(GeneratorAnswer.class);
        when(generatorAnswer.generatorAnswer()).thenReturn(answer);

        GuessNumber guessNumber = new GuessNumber(generatorAnswer);

        //when
        String res = guessNumber.guess(inputNumber);

        //then
        assertEquals("4A0B", res);
    }

    @Test
    void should_return_0A4B_when_guess_number_given_1234() {
        //given
        int[] inputNumber = {1, 2, 3, 4};
        int[] answer = {4,3,2,1};
        GeneratorAnswer generatorAnswer = mock(GeneratorAnswer.class);
        when(generatorAnswer.generatorAnswer()).thenReturn(answer);

        GuessNumber guessNumber = new GuessNumber(generatorAnswer);

        //when
        String res = guessNumber.guess(inputNumber);

        //then
        assertEquals("0A4B", res);
    }

    @Test
    void should_return_0A0B_when_guess_number_given_1234() {
        //given
        int[] inputNumber = {1, 2, 3, 4};
        int[] answer = {5,6,7,8};
        GeneratorAnswer generatorAnswer = mock(GeneratorAnswer.class);
        when(generatorAnswer.generatorAnswer()).thenReturn(answer);

        GuessNumber guessNumber = new GuessNumber(generatorAnswer);

        //when
        String res = guessNumber.guess(inputNumber);

        //then
        assertEquals("0A0B", res);
    }

    @Test
    void should_return_2A2B_when_guess_number_given_1234() {
        //given
        int[] inputNumber = {1, 2, 3, 4};
        int[] answer = {1,2,4,3};
        GeneratorAnswer generatorAnswer = mock(GeneratorAnswer.class);
        when(generatorAnswer.generatorAnswer()).thenReturn(answer);

        GuessNumber guessNumber = new GuessNumber(generatorAnswer);

        //when
        String res = guessNumber.guess(inputNumber);

        //then
        assertEquals("2A2B", res);
    }

    @Test
    void should_return_1A1B_when_guess_number_given_1234() {
        //given
        int[] inputNumber = {1, 2, 3, 4};
        int[] answer = {1,3,5,9};
        GeneratorAnswer generatorAnswer = mock(GeneratorAnswer.class);
        when(generatorAnswer.generatorAnswer()).thenReturn(answer);

        GuessNumber guessNumber = new GuessNumber(generatorAnswer);

        //when
        String res = guessNumber.guess(inputNumber);

        //then
        assertEquals("1A1B", res);
    }

    @Test
    void should_return_0A2B_when_guess_number_given_1234() {
        //given
        int[] inputNumber = {2,1,6,8};
        int[] answer = {1,2,3,4};
        GeneratorAnswer generatorAnswer = mock(GeneratorAnswer.class);
        when(generatorAnswer.generatorAnswer()).thenReturn(answer);

        GuessNumber guessNumber = new GuessNumber(generatorAnswer);

        //when
        String res = guessNumber.guess(inputNumber);

        //then
        assertEquals("0A2B", res);
    }
}
