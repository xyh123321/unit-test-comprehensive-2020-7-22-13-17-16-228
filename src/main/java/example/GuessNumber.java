package example;

public class GuessNumber {
    private final int[] answer;

    public GuessNumber(int[] answer) {
        this.answer = answer;
    }

    public String guess(int[] inputNumber) {
        if(!GuessNumberUtil.isLegal(inputNumber)){
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

}
