package za.ac.cput.school_management.Service.employee.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.school_management.Service.employee.EmployeeAddressService;
import za.ac.cput.school_management.domain.employee.Employee;
import za.ac.cput.school_management.repository.employee.EmployeeAddressRepository;

import java.util.List;

public class EmployeeAddressServiceIMPL implements EmployeeAddressService {

    private final EmployeeAddressRepository repository;

    @Autowired
    public EmployeeAddressServiceIMPL(EmployeeAddressRepository repository) {
        this.repository = repository;
    }

    @Override
    public Employee save(Employee employee) {
        return this.repository.save(employee);
    }

    @Override
    public Employee read(String s) {
        return this.repository.findById(s).orElse(null);
    }

    @Override
    public Employee update(Employee employee) {
        return this.repository.save(employee);
    }

    @Override
    public void delete(String s) {
        this.repository.deleteById(s);
    }

    @Override
    public List<Employee> findAll() {
        return this.repository.findAll();
    }

}
