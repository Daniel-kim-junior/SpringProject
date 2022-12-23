package com.subject.minsung;

import com.subject.minsung.employee.EmployeeRepository;
import com.subject.minsung.employee.EmployeeService;
import com.subject.minsung.employee.EmployeeServiceImpl;
import com.subject.minsung.employee.JPAEmployeeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "jpabook.jpashop.repository")
public class SpringConfig {
    private final DataSource dataSource;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public EmployeeService employeeService(EmployeeRepository employeeRepository) {
        return new EmployeeServiceImpl(employeeRepository(dataSource));
    }

    @Bean
    public EmployeeRepository employeeRepository(DataSource dataSource) {
        return new JPAEmployeeRepository(dataSource);
    }
}
