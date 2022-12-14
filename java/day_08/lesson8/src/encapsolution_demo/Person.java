package encapsolution_demo;

public class Person {
//     Định nghĩa các thuộc tính của đối tượng Person
//    tính đóng gói thì các thuộc tính phải là private và phương thức thì phải có getter và setter cho n
    private int id;
    private String name;
    private int age;
    private String email;

    // Định nghĩa constructor không có tham số
    public Person() {
    }

    // Định nghĩa constructor có tham số
    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }
    // Các phương thức GETTER, SETTER để truy cập vào giá trị hoặc set lại giá trị của các thuộc tính
    // GETTER : read-only
    // SETTER : write-only

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 5) {
            System.out.println("Độ dài tên không được nhỏ hơn 5");
            return;
//            các câu lệnh sau return không được thực hiện
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
