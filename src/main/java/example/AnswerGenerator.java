package example;

import java.util.Random;

public class AnswerGenerator {

    public int[] generatorAnswer() {
        int count = 0;
        Random random = new Random();
        int[] answer = new int[4];
        while (count < 4) {
            boolean norepeat = true;
            int randomNum = random.nextInt(9);
            for (int ans : answer) {
                if (ans == randomNum) {
                    norepeat = false;
                    break;
                }
            }
            if (norepeat) {
                answer[count] = randomNum;
                count++;
            }
        }
        return answer;
    }

}
