package collection_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("John");
        list.add("Victor");
        list.add("Anna");
        list.add("Chris");

        System.out.println("Danh sách ban đầu: ");
        System.out.println(list);

        //Sắp xếp với Collections.sort()
        Collections.sort(list);
        System.out.println("Danh sách sau khi sắp xếp: ");
        System.out.println(list);


//        Đảo vị trí
        Collections.shuffle(list);
        System.out.println("Danh sách sau khi đảo vị trí: ");
        System.out.println(list);
//        Collection.fill(list, "Hiên");

    }
}
