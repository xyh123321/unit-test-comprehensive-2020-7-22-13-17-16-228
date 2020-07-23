package example;

import java.util.Arrays;

public class GuessNumber {
    private int[] answer;


    public GuessNumber(GeneratorAnswer generatorAnswer) {
        this.answer = generatorAnswer.generatorAnswer();
    }

    public GuessNumber(int[] answer) {
        this.answer = answer;
    }

    public String guess(int[] inputNumber) {
        if(!validInputNumber(inputNumber)){
            return "Invalid";
        }
        int correctNumber = 0, correctPositon = 0;
        for (int i = 0; i < inputNumber.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if(inputNumber[i] == answer[j]) {
                    if(i==j){
                        correctPositon++;
                    }else{
                        correctNumber++;
                    }

                }
            }
        }
        return correctPositon+"A"+correctNumber+"B";
    }

    public boolean validInputNumber(int[] inputNumber) {
        if(inputNumber.length != answer.length){
            return false;
        }

        for (int i = 0; i < inputNumber.length; i++) {
            if(inputNumber[i]<0 || inputNumber[i]>9){
                return false;
            }
            for (int j = i+1; j < inputNumber.length-1; j++) {
                if(inputNumber[i] == inputNumber[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
