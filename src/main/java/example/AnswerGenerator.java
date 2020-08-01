package example;

import java.util.*;

public class AnswerGenerator {

    public int[] generatorAnswer() {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();

        while (set.size() < 4) {
            int randomNum = random.nextInt(10);
            set.add(randomNum);
        }
        return set.stream().mapToInt(Integer::valueOf).toArray();
    }

}
