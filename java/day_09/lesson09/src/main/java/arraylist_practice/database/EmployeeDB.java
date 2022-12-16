package arraylist_practice.database;

import arraylist_practice.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDB {
    public static ArrayList<Employee> employees = new ArrayList<>(List.of(
            new Employee(1,"Vu Kien", "a123kien@gmail.com", 1_000_000),
            new Employee(2,"Vu Kien 2", "a124kien@gmail.com", 2_000_000),
            new Employee(3,"Vu Kien 3", "a125kien@gmail.com", 3_000_000),
            new Employee(4,"Vu Kien 4", "a126kien@gmail.com", 4_000_000),
            new Employee(5,"Vu Kien 5", "a127kien@gmail.com", 5_000_000),
            new Employee(6,"Vu Kien 6", "a128kien@gmail.com", 6_000_000)
    ));
}
