package example;

public class Main {
    public static void main(String[] args) {

        AnswerGenerator answerGenerator = new AnswerGenerator();
        int[] answer = answerGenerator.generatorAnswer();
        StringBuilder finalAnswer = new StringBuilder();
        for (int a : answer) {
            finalAnswer.append(a);
        }

        GuessNumber guessNumber = new GuessNumber(answer);

        for (int guessCount = 0; guessCount < 6; guessCount++) {
            if (guess(guessNumber, guessCount)) break;
        }
        System.out.println("The final answer is " + finalAnswer);
    }

    private static boolean guess(GuessNumber guessNumber, int guessCount) {
        GenerateInputNumber generateInputNumber = new GenerateInputNumber();
        int[] inputNumber = generateInputNumber.generateInputNumber();
        String res = guessNumber.guess(inputNumber);
        if (guessCount == 5) {
            System.out.println("you are failed!");
            return true;
        }
        if ("4A0B".equals(res)) {
            System.out.println("You win!");
            return true;
        } else {
            System.out.println("you answer is " + res);
        }
        return false;
    }
}
