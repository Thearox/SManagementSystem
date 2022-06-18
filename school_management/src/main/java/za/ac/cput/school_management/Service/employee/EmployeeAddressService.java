package za.ac.cput.school_management.Service.employee;

import za.ac.cput.school_management.Service.IService;
import za.ac.cput.school_management.domain.employee.Employee;

import java.util.List;

public interface EmployeeAddressService extends IService <Employee, String> {

    List<Employee> findAll();
}
