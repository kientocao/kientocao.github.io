package arraylist_practice.controller;

import arraylist_practice.database.EmployeeDB;
import arraylist_practice.model.Employee;
import arraylist_practice.repository.EmployeeRepository;
import arraylist_practice.service.EmployeeService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EmployeeController {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    EmployeeService employeeService = new EmployeeService();
    public void run(){
        Scanner sc = new Scanner(System.in);
        int option = 0;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();

            System.out.print("Nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: {
                    System.out.println("Thông tin tất cả các nhân viên là : ");
                    employeeService.printEmployee();
                    break;
                }
                case 2: {
                    System.out.println("Thêm id : ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Thêm tên : ");
                    String name = sc.nextLine();
                    System.out.println("Thêm email : ");
                    String email = sc.nextLine();
                    System.out.println("Thêm salary : ");
                    int salary = Integer.parseInt(sc.nextLine());
                    Employee employee = new Employee(id,name, email,salary);
                    System.out.println("Tổng số nhân viên sau khi thêm là: ");
                    employeeService.printaddEmployee(employee);
                    break;
                }
                case 3: {
                    System.out.print("Nhập tên cần tìm : ");
                    String name = sc.nextLine();
                    employeeService.printfindByName(name);
                    break;
                }
                case 4: {
                    System.out.println("Nhập id cần tìm: ");
                    int id = Integer.parseInt(sc.nextLine());
                    employeeService.printfindbyId(id);
                    break;
                }case 5: {
                    System.out.println("Nhập id nhân viên cần xóa");
                    int id = Integer.parseInt(sc.nextLine());
                    employeeService.printdeletebyId(id);
                    break;
                }case 6: {
                    System.out.println("Nhân viên có mức lương 5000000 đến 10000000 là: ");
                    employeeService.printfindbySalary();
                    break;

                }case 7: {
                    isQuit = true;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
                }
            }
        }
    }
    public static void showMenu() {
        System.out.println("\n********* MENU *********");
        System.out.println("1 - In thông tin của tất cả nhân viên");
        System.out.println("2 - Thêm nhân viên mới");
        System.out.println("3 - Tìm kiếm nhân viên theo name");
        System.out.println("4 - Tìm  kiếm nhân viên theo Id");
        System.out.println("5 - Xóa nhân viên theo id");
        System.out.println("6 - Tìm kiếm nhân viên có mức lương từ 5000000 đến 10000000 ");
        System.out.println("7 - Thoát");
    }
}
