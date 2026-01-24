public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World.");

        Person granpa = new Person();
        granpa.setAge(80);
        granpa.setName("おじいちゃん");;
        System.out.println(granpa);

        Person granma = new Person();
        granma.setAge(80);
        granma.setName("おばあちゃん");;
        System.out.println(granma);
        
    }
}
