package example;

public class Main {
    public static void main(String[] args) {


        GeneratorAnswerImpl generatorAnswer = new GeneratorAnswerImpl();
        int[] answer = generatorAnswer.generatorAnswer();

        GuessNumber guessNumber = new GuessNumber(answer);

        int count = 0;
        for (int i = 0; i < 6; i++) {
            GenerateInputNumber generateInputNumber = new GenerateInputNumber();
            int[] inputNumber = generateInputNumber.generateInputNumber();
            String res = guessNumber.guess(inputNumber);
            count++;
            String ans = "";
            for (int a:answer) {
                ans +=String.valueOf(a);
            }
           // System.out.println("answer "+ans);
            if(count==5){
                System.out.println("you are failed!");
                System.out.println("The final answer is " + ans);
                break;
            }
            if("4A0B".equals(res)){
                System.out.println("you win!");
                break;
            }else{
                System.out.println("you answer is " + res);
            }
        }
    }
}
