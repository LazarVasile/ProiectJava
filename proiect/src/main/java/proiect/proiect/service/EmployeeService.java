package proiect.proiect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proiect.proiect.model.Employee;
import proiect.proiect.repository.EmployeeRepository;

import java.util.List;


@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.getEmployees();
    }

    public List<Employee> addEmployee(Employee e){
        return employeeRepository.addEmployee(e);
    }

    public List<Employee> deleteEmployee(int id) {
        return employeeRepository.deleteEmployee(id);
    }
}
