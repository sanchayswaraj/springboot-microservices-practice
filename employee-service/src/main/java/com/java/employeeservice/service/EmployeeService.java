package com.java.employeeservice.service;

import com.java.employeeservice.dto.APIResponseDto;
import com.java.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
