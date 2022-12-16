package arraylist_practice.repository;

import arraylist_practice.database.EmployeeDB;
import arraylist_practice.model.Employee;

import java.util.ArrayList;

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
        return null;
    }
    public ArrayList<Employee> deleteById(int id2) {
        ArrayList<Employee> rs = new ArrayList<>();
        for (Employee e3:EmployeeDB.employees){
            if (e3.getId() != id2) {
                rs.add(e3);
            }
        }
        return rs;
    }
    public ArrayList<Employee> findBySalary(int minSalary, int maxSalary) {
        ArrayList<Employee> rs = new ArrayList<>();
        for (Employee e4:EmployeeDB.employees){
            if(e4.getSalary()>=minSalary && e4.getSalary()<=maxSalary) {
                rs.add(e4);
            }
        }
        return rs;
    }


}
