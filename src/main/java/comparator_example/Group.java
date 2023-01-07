package comparator_example;

import comparator_example.MyException.MyCoolException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Group implements Catalog {

    private Student[] student = new Student[10];

    public Group() {
        super();
    }

    public Student[] getStudent() {
        return student;
    }

    public void addStudent(Student person) throws MyCoolException {
        if (person == null) {
            throw new IllegalArgumentException("null student");
        }
        for (int i = 0; i < student.length; i++) {
            if (student[i] == null) {
                student[i] = person;
                return;
            }
        }
        throw new MyCoolException();
    }

    public void deleteStudent(int id) {
        for (int i = 0; i < student.length; i++) {
            if (student[i].getRecordBook() == id) {
                //if(student[i].equals(person)&& student[i].getRecordBook() == id){
                student[i] = null;
                break;                                                          //break для корректной работы
            }
        }
    }

    public void findStudent(String surname) {
        for (Student student : student) {
            //if (student != null && student.getSurname() == surname) {         //для проверки
            if (student != null && student.getSurname().equals(surname)) {
                System.out.println("\n" + "Found. " + student + ", ");
            }
        }
    }

    public void getInfo() {
        System.out.println("In a group ");
        for (Student student : student) //if (student != null)
        {
            System.out.println(student + ", ");
        }
    }

    //LESSON 4
    @Override
    public Student[] getRecruter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addStudentFromKeyBoard() throws MyCoolException {               //Lesson_4
        Scanner scan = new Scanner(System.in);
        Student newstudent = new Student();
        System.out.print("Enter name ");
        newstudent.setName(scan.next());
        System.out.print("Enter surname ");
        newstudent.setSurname(scan.next());
        System.out.print("Enter age ");
        newstudent.setAge(scan.nextInt());
        System.out.print("Enter gender ");
        if ("male".equals(scan.next().toLowerCase())) {                         //исключение на ввод 3-го варианта(!male и !female)????
            newstudent.setSex(Gender.male);
        } else if ("female".equals(scan.next().toLowerCase())) {
            //else{
            newstudent.setSex(Gender.female);
        } else {
            throw new IllegalArgumentException("wrong gender");
        }
        System.out.print("Enter recordBook ");
        newstudent.setRecordBook(scan.nextInt());
        addStudent(newstudent);
    }

    public void sortByAge() {                                                   //lessson_4
        Arrays.sort(student, new AgeComparator());
    }

    public void sortBySurname() {                                               //Lesson_4
        Arrays.sort(student, (Comparator<? super Student>) new SurnameComparator());
    }

}
