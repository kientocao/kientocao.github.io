package function_interface_built_in;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Hiên", "An","Hằng","Duy"));
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        };
        names.forEach(consumer);
//        Cách 2: Sử dụng lambda
        names.forEach(name -> System.out.println(name.toLowerCase()));
        Consumer<String> consumer1 = name -> System.out.println(name.toLowerCase());
        Consumer<String> consumer2 = name -> System.out.println(name + "-");
        print(names,consumer);
        print(names,consumer1);
        print(names,consumer2);
    }
    public static void print(List<String> list, Consumer<String> consumer) {
        for (String ele:
             list) {
            consumer.accept(ele);
        }
    }
}