package example;

public class Main {
    public static void main(String[] args) {


        AnswerGenerator generatorAnswer = new AnswerGenerator();
        int[] answer = generatorAnswer.generatorAnswer();
        String ans = "";
        for (int a:answer) {
            ans +=String.valueOf(a);
        }

        GuessNumber guessNumber = new GuessNumber(answer);

        for (int i = 0; i < 6; i++) {
            GenerateInputNumber generateInputNumber = new GenerateInputNumber();
            int[] inputNumber = generateInputNumber.generateInputNumber();
            String res = guessNumber.guess(inputNumber);
           // System.out.println("answer "+ans);
            if(i==5){
                System.out.println("you are failed!");
                System.out.println("The final answer is " + ans);
                break;
            }
            if("4A0B".equals(res)){
                System.out.println("You win!");
                break;
            }else{
                System.out.println("you answer is " + res);
            }
        }
    }
}
