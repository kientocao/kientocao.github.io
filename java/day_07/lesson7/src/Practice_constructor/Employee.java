package Practice_constructor;

public class Employee {
    public String name;
    public int age;
    public String address;
    public int totalHours;

    public Employee() {

    }
    public Employee(String name, int age, String address, int totalHours) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.totalHours = totalHours;
    }

    public void printInfo() {
        System.out.println(name + "-" + age +"-" + address + "-" + totalHours);
    }

    public int getSalary(int totalHours){
        int salary = totalHours*200000;
        return (int) (salary + bonus(salary));
    }
    public long bonus(int salary) {
        int bonus;
        if (totalHours>=200) {
            bonus = (int)(salary*0.2);
        }
        else if (totalHours>=100) {
            bonus = (int)(salary*0.1);
        }
        else {
            bonus = 0;
        }
        return bonus;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", totalHous=" + totalHours +
                '}';
    }
}
