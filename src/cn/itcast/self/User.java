package cn.itcast.self;

/**
 * @ClassName User
 * @Desciption
 * @Author ³Â×¿ÐÅ
 * @Date 2019/12/18 16:12
 * @Version 1.0
 **/

@UserAnnotation("cn.itcast.domain.Person")
public class User {
    private int id;
    private String name;
    private int age;
    public int testInt;


    public User() {
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
