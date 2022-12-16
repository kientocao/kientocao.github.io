package arraylist_practice.service;

import arraylist_practice.database.EmployeeDB;
import arraylist_practice.model.Employee;
import arraylist_practice.repository.EmployeeRepository;

import java.util.ArrayList;

import static arraylist_practice.database.EmployeeDB.employees;

public class EmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();
public void printEmployee(){
    ArrayList<Employee> rs = employeeRepository.findAll();
    for (Employee e: rs) {
        System.out.println(e);
    }
}
public void printaddEmployee(Employee employee){
    ArrayList<Employee> rs = employeeRepository.save(employee);
    for (Employee e:rs) {
        System.out.println(e);
    }
}
public void printfindByName(String name) {
for (Employee e: employeeRepository.findByNameContainsIgnoreCase(name)) {
    System.out.println(e);
}
}
public void printfindbyId(int id) {
    System.out.println(employeeRepository.findById(id));
}
public void printdeletebyId(int id) {
    ArrayList<Employee> rs = employeeRepository.deleteById(id);
    for (Employee e:rs) {
        System.out.println(e);
    }
}
public void printfindbySalary(){
    System.out.println(employeeRepository.findBySalary(5000000,10000000));
}
}
