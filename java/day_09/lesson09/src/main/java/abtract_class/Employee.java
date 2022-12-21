package abtract_class;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
abstract public class Employee {
    private int id;
    private String name;
    private int age;
    private int salaryBasic;
//    Điểm danh
    public void register() {
        System.out.println("Register ... ");
    }
//    Tính lương
abstract  public int calculateSalary();
//    In thông tin của nhân viên
    abstract void showInfo();
}
