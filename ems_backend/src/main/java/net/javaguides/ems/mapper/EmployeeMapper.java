package net.javaguides.ems.mapper;

import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.gefirstName(),
                employee.getlastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployeeDto(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.gefirstName(),
                employeeDto.getlastName(),
                employeeDto.getEmail()
        );
    }
}
