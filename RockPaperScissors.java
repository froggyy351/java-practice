import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {


    public static void main(String[] args){
        System.out.println("じゃんけんをしましょう。どの手にするか決めて、数字を入力してね。");
        System.out.println("１．グー");
        System.out.println("２．チョキ");
        System.out.println("３．パー");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] ArrayHand = {"１．グー", "２．チョキ", "３．パー"}; 

        int computerHand = random.nextInt(4) + 1;
        int userHand = scanner.nextInt();
        
        //冗長なので修正の余地あり。あいこの時もう一度じゃんけんするように改修。
        if(userHand > 3 || userHand < 1){
            System.out.println("エラー不正な数値です。");
        } else {
            if ((userHand == 1 && computerHand == 3) || (userHand == 2 && computerHand == 1) || (userHand == 3 && computerHand == 2)) {
                System.out.println("コンピュータの手：" + ArrayHand[computerHand - 1]);
                System.out.println("あなたの手：" + ArrayHand[userHand - 1]);
                System.out.println("あなたの負けです。");
            } else if ((userHand == 1 && computerHand == 2) || (userHand == 2 && computerHand == 3) || (userHand == 3 && computerHand == 1)) {
                System.out.println("コンピュータの手：" + ArrayHand[computerHand - 1]);
                System.out.println("あなたの手：" + ArrayHand[userHand - 1]);
                System.out.println("あなたの勝ちです。");
            } else if ( userHand == computerHand ) {
                System.out.println("コンピュータの手：" + ArrayHand[computerHand - 1]);
                System.out.println("あなたの手：" + ArrayHand[userHand - 1]);
                System.out.println("あいこです。もう１回");
            }
        }
    }
}
