package encapsolution_pactice;

import Inheritance_demo.Dog;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("sda",-1,15,"nhb");
        System.out.println(student);
//        student.showInfo();
        student.calculateSchoolarShip();
        Dog dog = new Dog("husky","white",4);
        dog.tails = 4;
    }
}
