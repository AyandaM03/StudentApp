package student;

import com.mycompany.studentapp.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class student {
    
    
    private static Student SearchStudent(ArrayList<Student> students, String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static boolean DeleteStudent(ArrayList<Student> students, String string) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

public class StudentTest {

    @Test
    public void TestSaveStudent() {
        ArrayList<Student> students = new ArrayList<>();
        Student.SaveStudent(students);  

        // Assuming the last added student is correct
        Student student = students.get(students.size() - 1);
        assertNotNull(student);
        assertEquals("123", student.getId());  
        assertEquals("John Doe", student.getName());  
    }

    @Test
    public void TestSearchStudent() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("123", "John Doe", 18, "john@example.com", "Software Development"));

        Student result = student.SearchStudent(students, "123");
        assertNotNull(result);
        assertEquals("123", result.getId());
    }

    @Test
    public void TestSearchStudent_StudentNotFound() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("123", "John Doe", 18, "john@example.com", "Software Development"));

        Student result = student.SearchStudent(students, "456");
        assertNull(result);
    }

    @Test
    public void TestDeleteStudent() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("123", "John Doe", 18, "john@example.com", "Software Development"));

        boolean result = student.DeleteStudent(students, "123");
        assertTrue(result);
        assertEquals(0, students.size());
    }

    @Test
    public void TestDeleteStudent_StudentNotFound() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("123", "John Doe", 18, "john@example.com", "Software Development"));

        boolean result = student.DeleteStudent(students, "456");
        assertFalse(result);
        assertEquals(1, students.size());
    }

    @Test
    public void TestStudentAge_StudentAgeValid() {
        int age = 18;
        boolean isValid = age >= 16;
        assertTrue(isValid);
    }

    @Test
    public void TestStudentAge_StudentAgeInvalid() {
        int age = 15;
        boolean isValid = age >= 16;
        assertFalse(isValid);
    }

    @Test
    public void TestStudentAge_StudentAgeInvalidCharacter() {
        try {
            Integer.parseInt("invalid");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            assertTrue(true); 
        }
    }
}
}
 
    
 


