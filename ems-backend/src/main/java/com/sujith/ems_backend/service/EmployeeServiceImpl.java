package com.sujith.ems_backend.service;

import com.sujith.ems_backend.dto.EmployeeDTO;
import com.sujith.ems_backend.entity.Employee;
import com.sujith.ems_backend.mapper.Mapper;
import com.sujith.ems_backend.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
        Employee emp = Mapper.toEmployee(employeeDTO);
        return Mapper.toEmployeeDTO(employeeRepository.save(emp));

    }

    @Override
    public EmployeeDTO getEmployee(Long id) {
        EmployeeDTO employeeDTO = Mapper.toEmployeeDTO(employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("Employee not found with this id "+id)));
        return employeeDTO;
    }

    @Override
    public List<EmployeeDTO> getALLEmployees() {

        List<Employee> employees = employeeRepository.findAll();
        List<EmployeeDTO> employeesDTO = employees.stream().map((employee -> Mapper.toEmployeeDTO(employee))).collect(Collectors.toList());
        return employeesDTO;
    }

}
