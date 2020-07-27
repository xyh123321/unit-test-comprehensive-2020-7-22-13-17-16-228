package example;

public class GuessNumberUtil {

    public static boolean isLegal(int[] numbers) {
        if (numbers.length != 4) {
            return false;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0 || numbers[i] > 9) {
                return false;
            }
            for (int j = i + 1; j < numbers.length - 1; j++) {
                if (numbers[i] == numbers[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
