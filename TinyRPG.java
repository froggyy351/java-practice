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
            scanner.nextLine();
            System.out.println("行動を選んでください");
            System.out.println("1. 攻撃");
            System.out.println("2. 回復");
            System.out.println("3. 逃げる");
            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    int damageToEnemy = random.nextInt(11) + 10;
                    enemyHp -= damageToEnemy;
                    System.out.println("敵に" + damageToEnemy + "のダメージを与えた");
                    scanner.nextLine();
                    break;
                case 2:
                    int healHp = random.nextInt(6) + 5;
                    playerHp += healHp;
                    System.out.println("あなたは" + healHp + "回復した！");
                    if (playerHp > 100){
                        playerHp = 100;   //回復は100を超えない。
                    }
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("プレイヤーは逃げ出した！");
                    scanner.nextLine();
                    break;            
                default:
                    System.out.println("不正な値です。入力し直してください。");
                    scanner.nextLine();
                    continue;
            }

            System.out.println("-- 敵のターン --");
            System.out.println("敵は攻撃を繰り出した！");
            scanner.nextLine();

            int damage = random.nextInt(11) + 10;
            playerHp -= damage;
            System.out.println("あなたは" + damage + "のダメージを受けた！");
            scanner.nextLine();

            if (enemyHp <= 0) {
                System.out.println("YOU WIN !!");
                scanner.nextLine();
                break;
            } else if (playerHp <= 0) {
                System.out.println("YOU LOSE, GAME OVER...");
                scanner.nextLine();
                break;
            } else {
                continue;
            }
        }
    }
}
