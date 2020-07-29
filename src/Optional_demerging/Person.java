package Optional_demerging;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String render;
    private int birthday;

    public Person(String name, String render, int birthday) {
        this.name = name;
        this.render = render;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRender() {
        return render;
    }

    public void setRender(String render) {
        this.render = render;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", render='" + render + '\'' + ", birthday=" + birthday + '}';
    }
}
