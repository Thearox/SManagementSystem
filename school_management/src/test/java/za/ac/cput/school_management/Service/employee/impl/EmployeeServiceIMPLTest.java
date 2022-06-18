package za.ac.cput.school_management.Service.employee.impl;

/*
    Wajedien Samuels (216287820)
    10 June 2022
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.school_management.Service.employee.EmployeeService;
import za.ac.cput.school_management.domain.employee.Employee;
import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.factory.employee.EmployeeFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceIMPLTest {

    private final Name user = new Name.Builder()
            .FirstName("Laanie")
            .LastName("Hond")
            .build();

    private final Employee employee = new Employee.Builder()
            .setStaffId("007")
            .setEmail("Hond@gmail.com")
            .setName(user)
            .build();

    @Autowired
    private EmployeeService service;

    @Test
    void create() {
        Employee created = service.create(employee);
        String emp = String.valueOf(employee);
        String output = String.valueOf(created);
        assertAll(
                () -> assertNotNull(created),
                () -> assertEquals(emp, output)
        );

        System.out.println(created);

    }

    @Test
    void tearDown() {

        service.delete(String.valueOf(employee));
    }

    @Test
    void read() {
        Employee created = service.create(employee);
        Optional<Employee> read = Optional.ofNullable(service.read(created.getStaffId()));
        System.out.println(read);
        String emp = String.valueOf(created);
        String output = String.valueOf(read.get());
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(emp, output)
        );
    }

    @Test
    void delete() {
        this.service.delete(String.valueOf(employee));
    }

    @Test
    void findByStaffId() {
        Employee created = service.create(employee);
        String employeeId = created.getStaffId();
        List<Employee> employeeNameList = service.getAll(employeeId);
        System.out.println(employeeNameList);
        assertSame(1, employeeNameList.size());
    }

    @Test
    void getEmployeeNameFromEmail() {
        Employee created = service.create(employee);
        if (service.emailValidation(employee.getEmail()) == false) {
            System.out.println("Insert correct email");
        }else {
            System.out.println(created);
        }
    }
}

