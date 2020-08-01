package example;

import java.util.Arrays;
import java.util.Objects;

public class AnswerValidator {

    public static boolean isLegal(int[] numbers) {
        if (numbers.length != 4) {
            return false;
        }

        long length = Arrays.stream(numbers).distinct().filter(number -> number >= 0 && number <= 9).count();

        return length == 4;
    }
}
