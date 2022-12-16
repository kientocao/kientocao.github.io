import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
//        Cách 1 sử dụng constructor
        Person person = new Person(1, "Kiên", "a123kien@gmail.com");
        System.out.println(person);
//        Cách 2 sử dụng buider: không cần thứ tự khi khai báo
        Person person1 = Person.builder()
                .email("a123kien@gmail.com")
                .id(2)
                .name("Vũ mạnh kiên")
                .build();
        System.out.println(person1);
//        Tạo ra nhiều đối tượng person
        Faker faker = new Faker();
        Person[] people = new Person[20];
        for(int i =0; i<people.length; i++) {
            people[i] = new Person(i+1,faker.name().fullName(),faker.internet().emailAddress());
        }
        for (Person p: people) {
            System.out.println(p);
        }
    }
}
