package example;

public class GuessNumber {

    public String guess(int[] inputNumber, int[] answer) {
        boolean isAllCorrect = true;
        for (int i = 0; i < inputNumber.length; i++) {
            if(inputNumber[i] != answer[i]) {
                isAllCorrect = false;
                break;
            }
        }
        if(isAllCorrect) {
            return "4A0B";
        }
        return null;
    }
}
