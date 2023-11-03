package Java_Practice.oct31.collectionsClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomizedList {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Jasnoor", 55));
        list.add(new Student("Prabh", 22));
        list.add(new Student("Honny", 28));
        list.add(new Student("ABC", 18));
        list.add(new Student("XYZ", 45));
        list.add(new Student("PQR", 30));

        // for each
        for (Student s: list) {
            if(s.getAge() >40){
                System.out.println(s.getName());
            }
        }

        // Iterator
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }





    }


}
