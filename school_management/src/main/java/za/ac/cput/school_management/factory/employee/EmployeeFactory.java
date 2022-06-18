package za.ac.cput.school_management.factory.employee;

import za.ac.cput.school_management.domain.employee.Employee;
import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.helper.StringHelper;

public class EmployeeFactory {

    public static Employee createEmployee(String staffId, String email, Name name) {

        if(staffId.isEmpty() || staffId == null || staffId.equals(""))
            return null;

        if(name == null)
            return null;

        Employee employee = new Employee.Builder()
                .setStaffId(staffId)
                .setEmail(email)
                .setName(name)
                .build();
        return employee;
    }
}
