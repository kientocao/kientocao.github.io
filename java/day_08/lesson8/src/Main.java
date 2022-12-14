import student_management.model.Student;
import student_management.service.StudentService;

public class Main {
//    CRUD: Create - Read - Update - Delete
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
//        Đối tượng
        Student student = studentService.createStudent();
//        Gọi phương thức của đối tượng
        studentService.printInfo(student);
//        Nhập nhiều đối tượng
        Student[] students = new Student[3];
        for (int i=0; i<students.length;i++) {
            students[i] = studentService.createStudent();
        }
        for (Student value:students) {
            studentService.printInfo(value);
        }
    }
}