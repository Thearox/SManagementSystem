package za.ac.cput.school_management.repository.student;

/*
Tyler Yorke Fredericks - 218047894
ADP3 JUNE ASSIGNMENT
StudentRepository.java
*/

import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends JpaRepository <Student, String> {



}
