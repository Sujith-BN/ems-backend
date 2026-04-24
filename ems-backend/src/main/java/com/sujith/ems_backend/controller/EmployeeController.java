package com.sujith.ems_backend.controller;

import com.sujith.ems_backend.dto.EmployeeDTO;
import com.sujith.ems_backend.service.EmployeeService;
import com.sujith.ems_backend.service.EmployeeServiceImpl;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ems/api/")

@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService  employeeService ;


    //Add an Employee -> Post Request
    @PostMapping("/add")
    public ResponseEntity<EmployeeDTO> addEmployee(@RequestBody EmployeeDTO employeeDto) {
        EmployeeDTO employeeDTO = employeeService.addEmployee(employeeDto);
        return new ResponseEntity<>(employeeDTO, HttpStatus.CREATED);
    }


    //Fetch Employee -> Get Request
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable  Long id) {
        EmployeeDTO employeeDTO = employeeService.getEmployee(id);
        return ResponseEntity.ok(employeeDTO);

    }

}







