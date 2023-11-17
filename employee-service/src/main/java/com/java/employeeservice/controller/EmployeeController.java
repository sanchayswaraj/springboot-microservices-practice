package com.java.employeeservice.controller;

import com.java.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import com.java.employeeservice.dto.APIResponseDto;
import com.java.employeeservice.dto.EmployeeDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    // Build Save Employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.saveEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    // Build Get Employee REST API
    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getEmployee(@PathVariable("id") Long employeeId){
        APIResponseDto apiResponseDto = employeeService.getEmployeeById(employeeId);
        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
    }


    //Delete an Employee

//    @DeleteMapping({id})
//    public ResponseEntity<APIResponseDto> deleteEmployee(@PathVariable("id") Long employeeId){
//        APIResponseDto apiResponseDto = employeeService.deleteEmployeeById(employeeId);
//        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
//    }
}
