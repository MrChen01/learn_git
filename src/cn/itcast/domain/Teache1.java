package cn.itcast.domain;

/**
 * @ClassName Teacher
 * @Desciption
 * @Author ��׿��
 * @Date 2019/12/24 9:40
 * @Version 1.0
 **/
public class Teache1 {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
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
}
