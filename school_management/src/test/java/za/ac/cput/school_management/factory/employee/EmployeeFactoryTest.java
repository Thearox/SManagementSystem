package za.ac.cput.school_management.factory.employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.school_management.domain.employee.Employee;
import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.factory.lookup.NameFactory;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    private Employee employee1;
    private Employee employee2;
    private Employee employee3;
    private Name name;

    @BeforeEach
    void setUp() {
        Employee employee3 = employee2;

        name = (Name) NameFactory.createName("Laanie", "Steve" , "Hond");
        Name user = new Name.Builder().FirstName("Laanie").build();
        Name Laanie = name;
        Employee employee = EmployeeFactory.createEmployee("007", "Hond@gmail.com", user);
        assertNotNull(employee);

    }

    @Test
    void buildWithSuccess() {
        Name user = new Name.Builder().FirstName("Laanie").build();
        Employee employee = EmployeeFactory.createEmployee("007", "Hond@gmail.com", user);

        System.out.println(employee);
    }

    @Test
    void testIdentity(){
        assertSame(employee3, employee2);
        System.out.println("Identical");
    }

    @Test
    @Timeout(2)
    void testTimeout() throws InterruptedException {
        Thread.sleep(200);
        System.out.println("Test timed out");
    }

    @Test
    @Disabled
    void testDisable() { assertEquals(employee3,employee2);}
}