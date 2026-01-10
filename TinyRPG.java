import java.util.Random;
import java.util.Scanner;

public class TinyRPG {

    public static void main(String args[]){

        int playerHp = 100;
        int enemyHp = 100;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while(true){
            System.out.println("-- あなたのターン --");
            System.out.println("あなた HP: " + playerHp);
            System.out.println("敵 HP: " + enemyHp);
            System.out.println("");
            System.out.println("行動を選んでください");
            System.out.println("1. 攻撃");
            System.out.println("2. 回復");
            System.out.println("3. 逃げる");
            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    enemyHp -= random.nextInt(11) + 10;
                    break;
                case 2:
                    playerHp += random.nextInt(6) + 5;
                    if (playerHp > 100){
                        playerHp = 100;   //回復は100を超えない。
                    }
                    break;
                case 3:
                    enemyHp -= random.nextInt(11) + 10;
                    break;            
                default:
                    System.out.println("不正な値です。入力し直してください。");
                    continue;
            }

            System.out.println("-- 敵のターン --");
            System.out.println("敵は攻撃を繰り出した！");

            playerHp -= random.nextInt(11) + 10;
            System.out.println("-- 敵のターン --");

            if (enemyHp <= 0) {
                System.out.println("YOU WIN !!");
            } else if (playerHp <= 0) {
                System.out.println("YOU LOSE, GAME OVER...");
            } else {
                continue;
            }
        }
    }
}
