package com.sujith.ems_backend.service;

import com.sujith.ems_backend.dto.EmployeeDTO;

public interface EmployeeService {

     EmployeeDTO addEmployee(EmployeeDTO employeeDTO);

    public EmployeeDTO getEmployee(Long id);
}
