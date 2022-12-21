package exception_demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowAndThrowsDemo {
    public static void main(String[] args) {
        try {
//            getAge(17);
            getAge(20);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
         try {
             getFile();
         } catch (FileNotFoundException e) {
             System.out.println(e.getMessage());
         }

    }
    public static void getAge(int age) {
        if (age >=18) {
            System.out.println("Đủ 18 tuổi đi nghĩa vụ quân sự");
        } else {
            throw new ArithmeticException("Không đủ tuổi đi nghĩa vụ quân sự");
        }
    }
//    Throw dùng cho uncheck
//    Throws dùng cho check
    public static void getFile() throws FileNotFoundException {
        File file = new File("text.txt");
        FileReader fileReader = new FileReader(file);
        System.out.println("Đọc file xong");
    }
}
