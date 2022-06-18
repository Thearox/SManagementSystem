package za.ac.cput.school_management.Service.employee.impl;


import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.employee.Employee;
import za.ac.cput.school_management.factory.employee.EmployeeFactory;
import za.ac.cput.school_management.repository.employee.EmployeeRepository;
import za.ac.cput.school_management.Service.employee.EmployeeService;

import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

    private EmployeeRepository repository;

    public EmployeeServiceIMPL (EmployeeRepository repository) {
        this.repository = repository;
    }

    public EmployeeServiceIMPL(){

    }

    @Override
    public Employee create(Employee employee) {
        return null;
    }

    public Employee read (String staffId) {
        Optional<Employee> optionalEmployee = this.repository.findById(staffId);
        return  repository.getReferenceById(staffId);
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    public void delete (Employee employee) {
        repository.delete(employee);
    }

    @Override
    public List<Employee> getAll(String staffId) {
        return repository.findAll();
    }

    @Override
    public void deleteById(String staffId) {
        Optional<Employee> employee = Optional.ofNullable(read(staffId));
        if (employee.isPresent()) delete(employee.get());
    }

    /*
        valEmail is the answer to Question 5
     */
    @Override
    public boolean emailValidation(String email) {
        String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPat = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPat.matcher(email);
        return matcher.find();
    }
}