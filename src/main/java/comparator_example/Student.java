package comparator_example;

public class Student extends Human {

    private int recordBook;

    /*public Student(int recordBook, String name, String Surname, int age) {
        super(name, Surname, age);
        this.recordBook = recordBook;
    } */

    public Student(int recordBook, String name, String Surname, int age, Gender sex) {
        super(name, Surname, age, sex);
        this.recordBook = recordBook;
    }

    public Student() {
    }

    public int getRecordBook() {
        return recordBook;
    }

    public void setRecordBook(int recordBook) {
        this.recordBook = recordBook;
    }

    @Override
    public int getAge() {
        return super.getAge(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSurname() {
        return super.getSurname(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Gender getSex() {
        return super.getSex(); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public String toString() {
        return "Student{" + "recordBook=" + recordBook + '}' + super.toString();
    }

}
