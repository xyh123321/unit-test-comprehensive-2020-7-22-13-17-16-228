package example;

import java.util.Random;

public class GeneratorAnswerImpl implements GeneratorAnswer{
    @Override
    public int[] generatorAnswer() {
        int count = 0;
        Random random = new Random();
        int[] res = new int[4];
        for (int i = 0; i < res.length; i++) {
            res[i] = random.nextInt(9);
        }
        while (count <4) {
            boolean norepeat = true;
            int num = random.nextInt(9);
            for (int i = 0; i < res.length; i++) {
                if(res[i] == num){
                    norepeat = false;
                    break;
                }
            }
            if(norepeat){
                res[count] = num;
                count++;
            }
        }
        return res;
    }

    public boolean validAnswer(int[] answer) {
        if(answer.length != 4){
            return false;
        }

        for (int i = 0; i < answer.length; i++) {
            if(answer[i]<0 || answer[i]>9){
                return false;
            }
            for (int j = i+1; j < answer.length-1; j++) {
                if(answer[i] == answer[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
