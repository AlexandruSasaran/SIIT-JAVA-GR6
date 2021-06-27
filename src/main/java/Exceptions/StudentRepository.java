package Exceptions;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentRepository {
    private static Logger LOGGER = Logger.getLogger(StudentRepository.class.getName());
    List<Student> studentList = new ArrayList<>();

    public void addStudent(String firstName, String lastName, String gender, LocalDate dateOfBirth, String cnp) {
        try {
            studentList.add(new Student(firstName, lastName, gender, dateOfBirth, cnp));
        } catch (IllegalArgumentException e) {
            LOGGER.log(Level.SEVERE, "Validation error while trying to create a new student.", e);

        }
    }

    public void deleteStudent(String cnp) {
        for (Student studentCnp : studentList) {
            if (studentCnp.getCnp().equals(cnp)) {
                studentList.remove(cnp);
            } else throw new NullPointerException("Invalid CNP; dont exist in Student repository");
        }
    }

    public List<Student> retrieveStudentsOfAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("The age is negative");
        }
        for (Student student : studentList) {
            if (getAge(student.getBirthDate()) == age) {
                System.out.println(student.toString());
            }
        }
        return null;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    private int getAge(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public void addStudent(Student student) {
    }
}

