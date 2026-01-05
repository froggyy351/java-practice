import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] arrayHand = {"１．グー", "２．チョキ", "３．パー"}; 

        //あいこだとループするようにwhileで囲う
        while(true){
            System.out.println("じゃんけんをしましょう。どの手にするか決めて、数字を入力してね。");
            System.out.println("１．グー");
            System.out.println("２．チョキ");
            System.out.println("３．パー");

            int computerHand = random.nextInt(3) + 1;  //引数の値を含まず0~2までを疑似乱数で返す。
            int userHand = scanner.nextInt();
            
            if(userHand > 3 || userHand < 1){
                System.out.println("エラー不正な数値です。");
                continue;
            } else {
                System.out.println("コンピュータの手：" + arrayHand[computerHand - 1]);
                System.out.println("あなたの手：" + arrayHand[userHand - 1]);

                if ((userHand == 1 && computerHand == 3) || (userHand == 2 && computerHand == 1) || (userHand == 3 && computerHand == 2)) {
                    System.out.println("あなたの負けです。");
                    break;
                } else if ((userHand == 1 && computerHand == 2) || (userHand == 2 && computerHand == 3) || (userHand == 3 && computerHand == 1)) {
                    System.out.println("あなたの勝ちです。");
                    break;
                } else if ( userHand == computerHand ) {
                    System.out.println("あいこです。もう１回");
                }
            }
        }
    }
}
