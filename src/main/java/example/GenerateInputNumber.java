package example;

import java.util.Scanner;

public class GenerateInputNumber {
    private int[] inputNumber;

    public int[] generateInputNumber() {
        Scanner scanner = new Scanner(System.in);
        int[] res = new int[4];
        int count = 1;
        System.out.println("Please input your  answer");
        while (count <5) {
            int num = scanner.nextInt();
            if(num>=0&&num<=9){
                res[count-1] = num;
                count++;
            }else{
                System.out.println("The input number needs to be greater than or equal to 0 and less than or equal to 9");
            }
        }
        return res;
    }

}
