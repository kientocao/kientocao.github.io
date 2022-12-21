package abtract_class;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Developer(1, "Nguyễn Văn A", 24,5_000_000, 40) ;
        System.out.println(employee.calculateSalary());
        Employee employee1 = new Tester(2, "Nguyễn Văn B", 27,6_000_000, 40) ;
        System.out.println(employee1.calculateSalary());
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee);
        System.out.println("In ra lương của từng nhân viên");
        for(Employee e: employees)
        {
            System.out.println(e.calculateSalary());
        }
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.calculateSalary() - o2.calculateSalary() ;
            }
        });
        System.out.println("Lương giảm dần");
        for (Employee e:employees
             ) {
//            System.out.println(e.calculateSalary());
            e.showInfo();
        }
//        Sắp xếp tuổi tăng dần
        employees.sort((new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge()-o2.getAge();
            }
        }));
//        System.out.println("Tuổi tăng dần");
//        for (Employee e:employees
//        ) {
//            e.showInfo();
//        }
//        employees.forEach(Employee::showInfo);

//        Sử dụng stream (demo)
//        stream, method reference, lamba expression (java 8)
        System.out.println("Lương cơ bản tăng dần");
        employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalaryBasic))
                .forEach(Employee::showInfo);
     }
    }

