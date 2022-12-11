package Practice_constructor;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Kiên";
        employee.age = 29;
        employee.address = "Hà Nội";
        employee.totalHours = 180;
        System.out.println(employee);
        employee.printInfo();
        System.out.println("Số tiền luong là: "+ employee.getSalary(100));
        System.out.println(employee.bonus(1000000));
    }
}
