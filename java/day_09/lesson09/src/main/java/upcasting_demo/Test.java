package upcasting_demo;

public class Test {
    public static void main(String[] args) {
//         Upcasting :

//         Khi biến tham chiếu của lớp cha tham chiếu tới đối tượng của lớp con
//         Ép kiểu không tường minh
//         Person person = new Student("Bùi Hiên");

//         Ép kiểu tường minh
//        Person person = (Person) new Student("Bùi Hiên");

//         Đối với các method được overide -> Gọi method của lớp con
//        person.eat();
//        person.work();

//         Đối với các method không được overide -> Gọi method của lớp cha
//        person.sleep();
        Person p = new Student("Hiên");
//        Nếu method được overide bởi lớp con => gọi method overide ở lớp con
//        Nếu method không overide bởi lớp con=> gọi method của lớp cha
        p.eat();
        p.sleep();
        p.work();
        ((Student) p).display();
//        ép kiểu chuyển sang student để gọi phương thức display
        System.out.println();

//        Downcasting
        Student student = (Student) p;
        student.display();
        student.eat();
        student.sleep();
        student.work();
    }
}
