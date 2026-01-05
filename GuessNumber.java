import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main (String[] args){
        Random random = new Random();
        int randomNum = random.nextInt(101);

        Scanner scanner = new Scanner(System.in);

        System.out.println("数あてゲーム！コンピュータが出したランダムな数字が何かを当ててね。");
        System.out.println("数字を入力してください。");

        //テスト用
        // System.out.println("答えは、" + randomNum);

        int inputNum = 101;
        int answerCount = 0;

        while(inputNum != randomNum) {
            answerCount ++;
            inputNum = scanner.nextInt();

            if (inputNum == randomNum) {
               System.out.println("大正解！　" + answerCount + "回で正解できました");
            } else if (inputNum > randomNum) {
                System.out.println("もっと小さい値です");
            } else if (inputNum < randomNum) {
                System.out.println("もっと大きい値です");
            }
        }
        
        scanner.close();
    }
}
