package cn.itcast.domain;

import java.util.Date;

/**
 * @ClassName Teacher
 * @Desciption
 * @Author ³Â×¿ÐÅ
 * @Date 2019/12/24 9:40
 * @Version 1.0
 **/
public class Teacher2 {
    private int id;
    private String name;

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Teacher2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
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
