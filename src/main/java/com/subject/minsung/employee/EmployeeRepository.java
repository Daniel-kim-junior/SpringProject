package com.subject.minsung.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository {

    Employee empCreate(Employee employee);
    void empUpdate(Employee employee);
    List<Employee> empListAll();
    void empDelete(Employee employee);
}
