package example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        AnswerGenerator answerGenerator = new AnswerGenerator();
        int[] answer = answerGenerator.generatorAnswer();
        GuessNumber guessNumber = new GuessNumber(answer);

        for (int guessCount = 0; guessCount < 6; guessCount++) {
            if (guess(guessNumber, guessCount)) break;
        }
        System.out.println("The final answer is " + Arrays.toString(answer));
    }

    private static boolean guess(GuessNumber guessNumber, int guessCount) {
        String correctGuess  = "4A0B";
        GenerateInputNumber generateInputNumber = new GenerateInputNumber();
        int[] inputNumber = generateInputNumber.generateInputNumber();
        String res = guessNumber.guess(inputNumber);
        if (guessCount == 5) {
            System.out.println("you are failed!");
            return true;
        }
        if (correctGuess.equals(res)) {
            System.out.println("You win!");
            return true;
        } else {
            System.out.println("you answer is " + res);
        }
        return false;
    }
}
