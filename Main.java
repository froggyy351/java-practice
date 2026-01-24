import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World.");

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
    }
}
