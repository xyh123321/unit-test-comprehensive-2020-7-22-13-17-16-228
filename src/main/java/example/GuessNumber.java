package example;

import java.util.Arrays;

public class GuessNumber {
    private int[] answer;

    public GuessNumber(GeneratorAnswer generatorAnswer) {
        this.answer = generatorAnswer.generatorAnswer();
    }

    public String guess(int[] inputNumber) {

        if( isAllCorrect(inputNumber)) {
            return "4A0B";
        }

        if(onlyNumAllCorrect(inputNumber)) {
            return "0A4B";
        }

        return null;
    }



    private boolean isAllCorrect(int[] inputNumber) {
        for (int i = 0; i < inputNumber.length; i++) {
            if(inputNumber[i] != answer[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean onlyNumAllCorrect(int[] inputNumber) {
        int count = 0;
        for (int i = 0; i < inputNumber.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if(inputNumber[i] == answer[j] && i!=j) {
                    count++;
                }
            }
        }
        return (count==4);
    }
}
