package proiect.proiect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proiect.proiect.model.Employee;
import proiect.proiect.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/get")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping("/add")
    public  List<Employee> addEmployee(@RequestBody Employee e) {
        return employeeService.addEmployee(e);
    }

    @DeleteMapping("/delete")
    public List<Employee> deleteEmployee(@RequestParam int id) {
        return employeeService.deleteEmployee(id);
    }
}
