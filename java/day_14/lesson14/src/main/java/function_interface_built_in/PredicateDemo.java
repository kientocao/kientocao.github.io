package function_interface_built_in;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(10,20,30,40,50));
//        numbers.removeIf(number -> number > 30);
//        System.out.println(numbers);
     Predicate<Integer> predicate = item -> item > 30;
     Predicate<Integer> predicate1 = item -> item %2 ==0;
     Predicate<Integer> predicate2 = item -> item %2 !=0;
     List<Integer> rs = filterList(numbers,predicate);
        System.out.println(rs);
        System.out.println("-----");
        List<Integer> rs1 = filterList(numbers,predicate1);
        System.out.println(rs1);
        System.out.println("-----");
        List<Integer> rs2 = filterList(numbers,predicate2);
        System.out.println(rs2);
        System.out.println("-----");
    }
    public static List<Integer>filterList(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> rs = new ArrayList<>();
//        Danh sách hứng dữ liệu
        for (Integer item: list) {
            if(predicate.test(item)) {
                rs.add(item);
//            Thêm item vào danh sách
            }
        }
        return rs;
    }
}
