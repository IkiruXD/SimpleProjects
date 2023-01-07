package comparator_example;

import comparator_example.MyException.MyCoolException;

public class Main {
    public static void main(String args[]) {

        Group g1 = new Group();

        Student s1 = new Student(12, "Kolya", "Ivanov", 23, Gender.male);
        Student s2 = new Student(124, "Marina", "Ivanova", 24, Gender.female);
        Student s3 = new Student(125, "Karina", "Ivanova", 25, Gender.female);
        Student s4 = new Student(126, "Masha", "Ivanova", 26, Gender.female);
        Student s5 = new Student(127, "Dasha", "Ivanova", 26, Gender.female);
        Student s6 = new Student(1277, "Sasha", "Ivanova", 26, Gender.female);
        Student s7 = new Student(1268, "Natasha", "Ivanova", 26, Gender.female);
        Student s8 = new Student(131, "Vika", "Dashkova", 26, Gender.female);
        Student s9 = new Student(121, "Rita", "Ivanova", 26, Gender.female);
        Student s10 = new Student(110, "Lera", "Ivanova", 28, Gender.female);

        Student s11 = new Student(007, "Vlad", "Ivanov", 20, Gender.male);

        try {
            //g1.addStudentFromKeyBoard();
            g1.addStudent(s1);
            g1.addStudent(s2);
            g1.addStudent(s3);
            g1.addStudent(s4);
            g1.addStudent(s5);
            g1.addStudent(s6);
            g1.addStudent(s7);
            g1.addStudent(s8);
            g1.addStudent(s9);
            //g1.addStudent(s10);
            //g1.addStudent(s11);

        } catch (MyCoolException ex) {
            System.out.println(ex.getMessage());
        }

        g1.getInfo();
        System.out.println();
        System.out.println("Delete student with recordBook 126");
        g1.deleteStudent(126);
        g1.getInfo();

        g1.findStudent("Dashkova");
        g1.sortBySurname();
        g1.getInfo();
    }

}
