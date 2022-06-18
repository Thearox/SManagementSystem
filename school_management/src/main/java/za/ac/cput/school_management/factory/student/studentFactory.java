package za.ac.cput.school_management.factory.student;

/*
Tyler Yorke Fredericks - 218047894
ADP3 JUNE ASSIGNMENT
StudentFactory.java
*/

import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.helper.StringHelper;

public class studentFactory {

    public static Student createStudent(String studentId, String email, Name name) {

        StringHelper.checkStringParam("studentId", studentId);
        StringHelper.checkStringParam("email", email);
        StringHelper.checkStringParam("name", String.valueOf(name));

        StringHelper.setEmptyIfNull("studentId", studentId);
        StringHelper.setEmptyIfNull("email", email);
        StringHelper.setEmptyIfNull("Name", String.valueOf(name));

        Student student = new Student.Builder()
                .setStudentId(studentId)
                .setEmail(email)
                .setName(name)
                .build();
        return student;
    }
}
