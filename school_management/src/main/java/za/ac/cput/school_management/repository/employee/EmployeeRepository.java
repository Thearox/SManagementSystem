package za.ac.cput.school_management.repository.employee;

/*
    Wajedien Samuels (216287820)
    10 June 2022
 */


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.employee.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
