package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessNumberTest {
    @Test
    void should_return_4A0B_when_guess_number_given_1234() {
        //given
        int[] answer = {1, 2, 3, 4};
        int[] inputNumber = {1, 2, 3, 4};
        GeneratorAnswer generatorAnswer = mock(GeneratorAnswer.class);
        when(generatorAnswer.generatorAnswer()).thenReturn(answer);

        GuessNumber guessNumber = new GuessNumber(generatorAnswer);

        //when
        String res = guessNumber.guess(inputNumber);

        //then
        assertEquals("4A0B", res);
    }


}
