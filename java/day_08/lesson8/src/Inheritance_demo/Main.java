package Inheritance_demo;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng dog từ lớp Dog
        Dog dog = new Dog("husky","white",4);

        // truy cập vào field của class Animal
        dog.setName("Rohu");
        dog.eat(); // Gọi phương thức của lớp Animal
        dog.display(); // Gọi phương thức của lớp Dog


        // Khởi tạo đối tượng Dog bằng constructor có tham số, super từ class Animal
        Dog dog1 = new Dog();
        dog1.setName("Pitbull");
        dog1.setColor("Black");
        dog1.setLegs(4);

        // Gọi 1 số phương thức ứng với dog1 instance
        dog1.eat();
        dog1.display();
        dog1.ears =1;
        dog1.eyes =1;
    }
}
