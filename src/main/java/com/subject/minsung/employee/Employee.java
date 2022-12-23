package com.subject.minsung.employee;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="employee")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(name="empNo")
    private String empNo;
    private String email;
    @Column(name="phoneNum")
    private String phone;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmpNo() {
        return empNo;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
