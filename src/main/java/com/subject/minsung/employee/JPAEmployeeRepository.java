package com.subject.minsung.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class JPAEmployeeRepository implements EmployeeRepository {


    public JPAEmployeeRepository() {

    }

    @Override
    public Employee empCreate(Employee employee) {
        return null;
    }

    @Override
    public void empUpdate(Employee employee) {

    }

    @Override
    public List<Employee> empListAll() {
        return null;
    }

    @Override
    public void empDelete(Employee employee) {

    }
}
