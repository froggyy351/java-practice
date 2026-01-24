public class Person {

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "name:" + this.name + " / age:" + this.age;
    }

    //メンバ
    private int age;
    private String name;

    // getter
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    //setter
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

}
