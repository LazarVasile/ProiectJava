package proiect.proiect.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import proiect.proiect.model.Employee;
import proiect.proiect.querys.Querys;

import java.util.List;

@Repository
public class EmployeeRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Employee> getEmployees() {
        return jdbcTemplate.query(Querys.GET_EMPLOYEES_SQL, new BeanPropertyRowMapper<>(Employee.class));
    }

    public List<Employee> addEmployee(Employee e) {
        jdbcTemplate.update(Querys.ADD_EMPLOYEE, e.getId(), e.getCnp(), e.getFirstName(), e.getLastName(), e.getPhoneNumber(), e.getPosition(),
                e.getDatefrom(), e.getSalary());
        return jdbcTemplate.query(Querys.GET_EMPLOYEES_SQL, new BeanPropertyRowMapper<>(Employee.class));
    }

    public List<Employee> deleteEmployee(int id) {
        jdbcTemplate.update(Querys.DELETE_EMPLOYEE, id);
        return jdbcTemplate.query(Querys.GET_EMPLOYEES_SQL, new BeanPropertyRowMapper<>(Employee.class));
    }





}
