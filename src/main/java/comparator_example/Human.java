package comparator_example;

public class Human {

    private String name;
    private String Surname;
    private int age;
    private Gender sex;

    /*public Human(String name, String Surname, int age) {
        this.name = name;
        this.Surname = Surname;
        this.age = age;
    } */

    public Human(String name, String Surname, int age, Gender sex) {
        this.name = name;
        this.Surname = Surname;
        this.age = age;
        this.sex = sex;
    }

    public Human() {
    }


    public Gender getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    /*@Override
    public String toString() {
        return "Human{" + "name=" + name + ", Surname=" + Surname + ", age=" + age + '}';
    } */

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", Surname=" + Surname + ", age=" + age + ", sex=" + sex + '}';
    }



}
