package za.ac.cput.school_management.Service.student.impl;

/*
Tyler Yorke Fredericks - 218047894
ADP3 JUNE ASSIGNMENT
StudentServiceIMPLTest.java
*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.school_management.Service.student.StudentService;
import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.factory.lookup.NameFactory;
import za.ac.cput.school_management.factory.student.StudentFactory;


class StudentServiceIMPLTest {

    @Autowired
    private Name name;
    private Student student;
    private StudentService studentService;

    @BeforeEach
    void setUp() throws Exception {
        this.name = NameFactory.createName("One", "Two", "Three");
        this.student = StudentFactory.createStudent("01", "02@test.com", name);
        System.out.println(student);
    }

    @Test
    void save() {
        this.studentService.save(this.student);
        System.out.println(studentService);
    }

    @Test
    void read() {

    }

    @Test
    void delete() {
        this.studentService.delete(String.valueOf(this.student));
    }


    @Test
    void findAll() {
        this.studentService.findAll().contains(this.student);
    }
}