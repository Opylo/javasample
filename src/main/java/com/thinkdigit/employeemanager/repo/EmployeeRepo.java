package com.thinkdigit.employeemanager.repo;

import com.thinkdigit.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);
    //finding each employee by id
    Optional<Employee> findEmployeeById(Long id);
}
