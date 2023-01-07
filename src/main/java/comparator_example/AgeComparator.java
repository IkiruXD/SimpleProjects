package comparator_example;

import java.util.Comparator;

public class AgeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 != null && o2==null){
            return 1;
        }
        if(o1 == null && o2 != null){
            return -1;
        }
        if(o1 == null && o2 == null){
            return 0;
        }

        Student a = (Student) o1;
        Student b = (Student) o2;

        int age1 = a.getAge();
        int age2 = b.getAge();

        /*
        if(age1.compareTo(age2)>0){
            return 1;
        }
        if(age1.compareTo(age2)<0){
            return -1;
        }
        */

        return 0;
    }

}