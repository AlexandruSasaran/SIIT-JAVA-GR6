package Exceptions;
import Exceptions.*;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import java.util.List;


public class StudentRepositoryTest extends TestCase {
    private StudentRepository studentRepository;

    @Before
    public void setUp() {
        studentRepository = new StudentRepository();
    }

    @Test
    public void testAddStudent() {
        try {
            studentRepository.addStudent(new Student("Radu", "Halatiu","male", LocalDate.of(2001, 12, 10),"0123456789123"));
            studentRepository.addStudent(new Student("Simion", "Belbe", "M", LocalDate.of(2020, 12, 10), "786456"));
            studentRepository.addStudent(new Student("Cosmina", "Petria", "female", LocalDate.of(1999, 12, 10), "498"));
            studentRepository.addStudent(new Student("Ioana", "Badea", "f", LocalDate.of(2192, 12, 10), "1234567890123"));
        }catch (IllegalArgumentException e){

        }
    }

    @Test
    public void testDeleteStudent() {
        studentRepository.addStudent(new Student("Radu", "Halatiu","male", LocalDate.of(2001, 12, 10),"0123456789123"));
        try {
            studentRepository.deleteStudent("");
        } catch (NullPointerException e){

        }
    }

    @Test
    public void testRetrieveStudentsOfAge() {
        List<Student> result = studentRepository.retrieveStudentsOfAge(20);
        try {
            assertEquals(studentRepository.retrieveStudentsOfAge(20).size(), 3);

        } catch (Exception e){

        }
    }
}
