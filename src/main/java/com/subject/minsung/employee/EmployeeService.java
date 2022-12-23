package com.subject.minsung.employee;

import java.util.List;

public interface EmployeeService {
    /*
    * CRUD
    *
    * */
    void save(Employee employee);
    List<Employee> findAllEmp();
    void update(Employee employee);
    void delete(Employee employee);
}
