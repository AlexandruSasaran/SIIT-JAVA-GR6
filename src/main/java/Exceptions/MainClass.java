package Exceptions;

import java.time.LocalDate;

public class MainClass {
    public static void main(String[] args) {
        StudentRepository studentList = new StudentRepository();
        studentList.addStudent("Dan", "Pop", "M", LocalDate.of(2001, 12, 10), "137224561");
        studentList.addStudent("Andrei", "Munteanu", "m", LocalDate.of(2001, 10, 02), "2081210123456");
        studentList.addStudent("Ana", "Moldovan", "F", LocalDate.of(2008, 12, 10), "2081210123456");
        studentList.getStudentList().forEach(System.out::println);
        studentList.retrieveStudentsOfAge(18);
        studentList.deleteStudent("343232");
        studentList.getStudentList().forEach(System.out::println);
    }
}

