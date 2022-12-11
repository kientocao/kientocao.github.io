package classdemo;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
//        null - default value của String
        System.out.println(person.age);
//        0 - default value của int
        person.name = "Nguyễn Văn A";
        person.email = "a123kien@gmail.com";
        person.age = 20;
        person.address = "Hà Nội";
//        In ra thông tin của đối tượng
        System.out.println(person.name + "-" + person.email +"-" +person.age +"-" + person.address);
        person.showInfo();
        person.eat();
        person.play("Bóng đá");
        System.out.println(person);
//        System.out.println(person.toString());
//        Khởi tạo đối tượng phone
        Phone phone = new Phone();
        phone.name = "iPhone 13 pro";
        phone.brand = "Apple";
        person.usePhone(phone);
        Calculator cal = new Calculator();
        cal.number1 =10;
        cal.number2 = 3;
        System.out.println("Thương hai số là: "+ cal.division());
//        System.out.println(10/0);
        System.out.println("Code continue...");
        System.out.println("Tổng hai số là: " + cal.addition());
        System.out.println("Tích hai số là: " + cal.multi());
        System.out.println("Hiệu hai số là: " + cal.subtract());
//        Khởi tạo đối tượng person với constructor
        Person person1 = new Person("Vũ Mạnh kiên", "b@gmail.com");
        System.out.println(person1);
        Person person2 = new Person("Vũ Mạnh Kiên" , "a123kien@gmail.com", 18,"HaNôi");
        System.out.println(person2);
    }
}
