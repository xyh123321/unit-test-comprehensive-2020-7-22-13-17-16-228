package example;

public class GuessNumber {
    private int[] answer;

    public GuessNumber(GeneratorAnswer generatorAnswer) {
        this.answer = generatorAnswer.generatorAnswer();
    }

    public String guess(int[] inputNumber) {

        boolean isAllCorrect = isAllCorrect(inputNumber);

        if(isAllCorrect) {
            return "4A0B";
        }

        return null;
    }

    public boolean isAllCorrect(int[] inputNumber) {
        for (int i = 0; i < inputNumber.length; i++) {
            if(inputNumber[i] != answer[i]) {
                return false;
            }
        }
        return true;
    }
}
