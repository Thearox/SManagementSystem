package za.ac.cput.school_management.Service.employee;

/*
    Wajedien Samuels (216287820)
    10 June 2022
 */

import za.ac.cput.school_management.Service.IService;
import za.ac.cput.school_management.domain.employee.Employee;

import java.util.List;

public interface EmployeeService extends IService<Employee, String> {

    List<Employee> getAll(String staffId);
    void deleteById(String staffId);

    boolean emailValidation (String input);
}
