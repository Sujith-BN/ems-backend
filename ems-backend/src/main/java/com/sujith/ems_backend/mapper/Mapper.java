package com.sujith.ems_backend.mapper;

import com.sujith.ems_backend.dto.EmployeeDTO;
import com.sujith.ems_backend.entity.Employee;

public class Mapper {

    public static Employee toEmployee(EmployeeDTO employeeDTO) {
        Employee emp = new Employee();
        emp.setId(employeeDTO.getId());
        emp.setFirstName(employeeDTO.getFirstName());
        emp.setLastName(employeeDTO.getLastName());
        emp.setEmail(employeeDTO.getEmail());
        return emp;
    }
    public  static EmployeeDTO toEmployeeDTO(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employee.getId());
        employeeDTO.setFirstName(employee.getFirstName());
        employeeDTO.setLastName(employee.getLastName());
        employeeDTO.setEmail(employee.getEmail());
        return employeeDTO;
    }



}
