public class Person {

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "name:" + this.name + " / age:" + this.age;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. 同じメモリ番地（自分自身）なら当然 true
        if (this == obj) { return true; }

        // 2. 相手が Person クラスの仲間かどうかをチェック
        if (obj instanceof Person) { 
            Person p = (Person)obj;
            // 3. 名前が同じなら true、違えば false
            return this.name.equals(p.name);
        }

        // 4. 【重要】Personですらないなら、絶対に false！
        return false; 
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
