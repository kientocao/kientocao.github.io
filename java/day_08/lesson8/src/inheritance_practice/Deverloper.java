package inheritance_practice;

import student_management.model.Student;

import java.util.Random;
import java.util.Scanner;

public class Deverloper extends Employee{
    private int overtimeHours;
    public Deverloper(){

    }

    public Deverloper(int id, String name, int age, String phone, String email, int salaryBasic, int overtimeHours) {
        super(id, name, age, phone, email, salaryBasic);
        this.overtimeHours = overtimeHours;
    }
    public createDev() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name = ");
        String name = sc.nextLine();
        System.out.println("Enter theoryPoint ");
        double theoryPoint = sc.nextDouble();
        System.out.println("Enter praticePoint");
        double practicePoint = sc.nextDouble();
        int id = (int) Math.floor(Math.random()*100);
        Student std = new Student (id,name,theoryPoint, practicePoint);

    }
    public int calculateSalary() {
    return getSalaryBasic() + overtimeHours*200000;
    }
    public int getOvertimeHours() {
     return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
}
