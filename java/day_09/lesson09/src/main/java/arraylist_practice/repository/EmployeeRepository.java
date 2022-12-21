package arraylist_practice.repository;

import arraylist_practice.database.EmployeeDB;
import arraylist_practice.exception.InvalidSalaryException;
import arraylist_practice.exception.NotFoundException;
import arraylist_practice.model.Employee;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class EmployeeRepository {
    public ArrayList<Employee> findAll(){
        return EmployeeDB.employees;
    }
    public ArrayList<Employee> save(Employee employee) {
        EmployeeDB.employees.add(employee);
        return EmployeeDB.employees;
    }
    public ArrayList<Employee> findByNameContainsIgnoreCase(String name) {
        ArrayList<Employee> rs = new ArrayList<>();
        for (Employee e: EmployeeDB.employees) {
            if(e.getName().toLowerCase().contains(name.toLowerCase())){
                rs.add(e);
            }
        }
        return rs;
    }
    public Employee findById(int id) {
         for (Employee e2:EmployeeDB.employees) {
             if(e2.getId() == id){
                 return e2;
             }
         }
        throw new NotFoundException("Not found employee with id = " + id);
    }
    public ArrayList<Employee> deleteById(int id2) {
        Employee employee = findById(id2);
        EmployeeDB.employees.remove(employee);
        ArrayList<Employee> rs = new ArrayList<>();
        for (Employee e3:EmployeeDB.employees){
            if (e3.getId() != id2) {
                rs.add(e3);
            }
        }
        return rs;
    }
    public ArrayList<Employee> findBySalary(int minSalary, int maxSalary) {
        if(minSalary >=maxSalary) {
            throw new InvalidSalaryException("MinSalary khoong duoc >= maxSalary");
        }
//        ArrayList<Employee> rs = new ArrayList<>();
//        for (Employee e4:EmployeeDB.employees){
//            if(e4.getSalary()>=minSalary && e4.getSalary()<=maxSalary) {
//                rs.add(e4);
//            }
//        }
        ArrayList<Employee> rs = (ArrayList<Employee>) EmployeeDB.employees.stream()
                .filter(e -> e.getSalary() >= minSalary && e.getSalary() <= maxSalary)
                .collect(Collectors.toList());
        return rs;
    }

}
