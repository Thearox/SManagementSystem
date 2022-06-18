package za.ac.cput.school_management.Service.student;

/*
Tyler Yorke Fredericks - 218047894
ADP3 JUNE ASSIGNMENT
StudentService.java
*/

import za.ac.cput.school_management.Service.IService;
import za.ac.cput.school_management.domain.student.Student;

import java.util.List;

public interface studentService extends IService<Student, String> {
    Student retrieveById(String s);
    List<Student> getAll();

}
