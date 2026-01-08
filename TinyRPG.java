import java.util.Random;
import java.util.Scanner;

public class TinyRPG {

    static int playerHp = 100;
    static int enemyHp = 100;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public static void main(String args[]){
        while(true){
            System.out.println("-- ターン開始 --");
            System.out.println("あなた HP: " + playerHp);
            System.out.println("敵 HP: " + enemyHp);
        }
    
    }

    public void attack(){
        enemyHp -= random.nextInt(11) + 10;
    }

    public void recover(){
        playerHp += random.nextInt(6) + 5;
        if (playerHp > 100){
            playerHp = 100;   //回復は100を超えない。
        }
    }

}
