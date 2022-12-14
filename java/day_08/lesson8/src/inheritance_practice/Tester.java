package inheritance_practice;

public class Tester extends Employee{
    private int error;
    public Tester() {
    }
    public Tester(int id, String name, int age, String phone, String email, int salaryBasic, int error) {
        super(id, name, age, phone, email, salaryBasic);
        this.error=error;
    }
    public int CalsalaryTester(){
        return getSalaryBasic() + error*50000;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
}
