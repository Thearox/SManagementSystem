package za.ac.cput.school_management.repository.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.school_management.domain.employee.Employee;

public interface EmployeeAddressRepository extends JpaRepository <Employee, String> {
}
