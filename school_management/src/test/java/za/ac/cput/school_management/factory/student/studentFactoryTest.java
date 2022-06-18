package za.ac.cput.school_management.factory.student;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.domain.student.Student;

import static org.junit.jupiter.api.Assertions.*;

class studentFactoryTest {

    private static Name studentName;

    @BeforeAll
    public static void setUp() throws Exception {
        studentName = new Name.Builder()
                .setFirstName("John")
                .setMiddleName("The")
                .setLastName("Smith")
                .build();
    }

    @Test
    @DisplayName("New Student Test")
    public void createStudent() {
        Student student = studentFactory.createStudent("001", "johnsmith@test.com",studentName);
        assertNotNull(student);
        System.out.println(student);
        System.out.println("Test has passed");
    }

    @Test
    @DisplayName("New Student Test")
    public void createStudentNull() {
        Student student = studentFactory.createStudent("002", null, studentName);
        System.out.println(student);
        assertAll(
                () -> assertNotNull(student),
                () -> assertNotNull(student.getEmail())
        );
    }

}