package com.sujith.ems_backend.controller;

import com.sujith.ems_backend.dto.EmployeeDTO;
import com.sujith.ems_backend.service.EmployeeService;
import com.sujith.ems_backend.service.EmployeeServiceImpl;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ems/api/")

@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeServiceImpl  employeeServiceImpl ;


    //Add an Employee -> Post Request
    @PostMapping("/employees")
    public ResponseEntity<EmployeeDTO> addEmployee(@RequestBody EmployeeDTO employeeDto) {
        EmployeeDTO employeeDTO = employeeServiceImpl.addEmployee(employeeDto);
        return new ResponseEntity<>(employeeDTO, HttpStatus.CREATED);
    }


    //Fetch Employee -> Get Request
    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable  Long id) {
        EmployeeDTO employeeDTO = employeeServiceImpl.getEmployee(id);
        return ResponseEntity.ok(employeeDTO);

    }

    //Fetch all employees
    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
        return ResponseEntity.ok(employeeServiceImpl.getALLEmployees());

    }


    //Delete employees by Id
    @PostMapping("/employees/delete/{id}")
    public String DeleteEmployee(@PathVariable Long id) {
        return employeeServiceImpl.deleteEmployee(id);
    }


    //Update user
    @PostMapping("/employee/update/{id}")
    public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable Long id,@RequestBody EmployeeDTO employeeDTO) {
        return ResponseEntity.ok(employeeServiceImpl.updateEmployee(id,employeeDTO));
    }





}







