package com.sujith.ems_backend.service;

import com.sujith.ems_backend.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

     EmployeeDTO addEmployee(EmployeeDTO employeeDTO);

    public EmployeeDTO getEmployee(Long id);

    public List<EmployeeDTO> getALLEmployees();

        public String deleteEmployee(Long id);
}
