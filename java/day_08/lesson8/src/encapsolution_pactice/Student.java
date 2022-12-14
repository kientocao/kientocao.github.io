package encapsolution_pactice;

public class Student {
    private String id;
    private double avgPoint;
    private int age;
    private String className;

    public Student() {

    }

    // public Student (String id, double avgPoint, int age, String className) {
//    this.id = id;
//    this.avgPoint = avgPoint;
//    this.age = age;
//    this.className = className;
//}
    public Student(String id, double avgPoint, int age, String className) {
        setId(id);
        setAvgPoint(avgPoint);
        setAge(age);
        setClassName(className);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() != 8) {
            System.out.println("Mã sinh viên phải có 8 kí tự ");
            return;
        }
        this.id = id;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        if (0 >= avgPoint || avgPoint >= 10) {
            System.out.println("Điểm trung bình phải từ 0-10 ");
            return;
        }
        this.avgPoint = avgPoint;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("Tuổi phải lớn hơn hoặc bằng 18");
        }
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
//    if(className.charAt(0)!='A' || className.charAt(0)!='C') {
        if (className.startsWith("A") || className.startsWith("C")) {
            System.out.println("Lớp phải bắt đầu bằng kí tự \"A\" hoặc \"C\"");
            return;
        }
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", avgPoint=" + avgPoint +
                ", age=" + age +
                ", className='" + className + '\'' +
                '}';
    }

    public void showInfo() {
        System.out.println(this);
    }

    public boolean calculateSchoolarShip() {
        if (avgPoint >= 18) {
            System.out.println("Nhận được học bổng");
        } else {
            System.out.println("Nhận được học bổng");
        }
        return true;
    }
}
