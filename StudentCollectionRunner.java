import Collections.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(),student2.getId());
    }
}
public class StudentCollectionRunner {
    public static void main(String[] args) {
        System.out.println("Hello world! This Runner started for Collections");
//        Student ranga = new Student(String "Ranga",int 01);
        List<Student> students = List.of(new Student("Ranga",1),
                new Student("Adam",3),
                new Student("Rajesh",100), new Student("Lily",302),
                new Student("Heman",32),new Student("Raj",55)
        );

        ArrayList<Student> studentsAl = new ArrayList<>(students);

        System.out.println(studentsAl);

        Collections.sort(studentsAl);

        System.out.println("Descending"+ studentsAl);

        Collections.sort(studentsAl, new AscendingStudentComparator());
        System.out.println("Ascending"+ studentsAl);
    }
}