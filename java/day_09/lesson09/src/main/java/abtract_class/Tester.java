package abtract_class;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

    public  class Tester extends Employee{
    private int error;
    public Tester(int id, String name, int age, int salaryBasic ,int error ) {
        super(id,name,age,salaryBasic);
        this.error = error;
    };


    @Override
    public int calculateSalary() {
        return this.getSalaryBasic() + this.error*50_000;
    }
    @Override
    void showInfo() {
        String message = String.format("id: %d, name: %s, age: %d, salaryBasic: %d,overtimeHours: %d,salary: %d", this.getId(), this.getName(), this.getAge(), this.getSalaryBasic(), this.error, this.calculateSalary());
        System.out.println(message);
    }
}

