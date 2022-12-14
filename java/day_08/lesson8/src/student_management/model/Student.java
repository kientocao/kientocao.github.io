package student_management.model;

public class Student {
    public int id;
    public String name;
    public double theoryPoint;
    public double praticePoint;
    public Student(){}
    public Student( int id, String name, double theoryPoint, double praticePoint) {
        this.id = id;
        this.name = name;
         this.theoryPoint = theoryPoint;
         this.praticePoint = praticePoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", theoryPoint=" + theoryPoint +
                ", praticePoint=" + praticePoint +
                '}';
    }
}
