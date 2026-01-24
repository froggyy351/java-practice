import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World.");

        //Person.javaの、toString()関数をオーバーライドしたからテスト
        Person granpa = new Person();
        granpa.setAge(80);
        granpa.setName("おじい");;
        System.out.println(granpa);

        Person granma = new Person();
        granma.setAge(80);
        granma.setName("おばあ");;
        System.out.println(granma);
        
        System.out.println( granma.equals(granpa) );

        granpa.setName("おばあ");
        System.out.println( granma.equals(granpa) );

        //ArrayListをおためし
        ArrayList<String> array = new ArrayList<>();

        array.add("わし");
        array.add("僕");
        array.add("俺");
        array.add("私");
        array.add("それがし");
        array.add("おいどん");

        System.out.println("男の一人称だどん");
        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }

        //ボタンを表示させる。
        JFrame frame = new JFrame("はじめてのGUI");
        JLabel label = new JLabel("Hello World");
        JButton button = new JButton("押してね");
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(label);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
