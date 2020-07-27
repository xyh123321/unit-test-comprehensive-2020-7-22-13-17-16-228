package example;

import java.util.Random;

public class AnswerGenerator {

    public int[] generatorAnswer() {
        int count = 0;
        Random random = new Random();
        int[] res = new int[4];
        for (int i = 0; i < res.length; i++) {
            res[i] = random.nextInt(9);
        }
        while (count < 4) {
            boolean norepeat = true;
            int num = random.nextInt(9);
            for (int re : res) {
                if (re == num) {
                    norepeat = false;
                    break;
                }
            }
            if (norepeat) {
                res[count] = num;
                count++;
            }
        }
        return res;
    }

}
