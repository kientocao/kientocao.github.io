import java.util.Arrays;

public class arayPratice4 {
    public static void main(String[] args) {
        System.out.println(repearString("a"));
    }
    public static StringBuilder repearString(String name){

        StringBuilder text= new StringBuilder();
        String [] array = new String[10] ;
        for (int i=0; i<10;i++) {
            array[i] = name;
        }
        for (String i: array
             ) {
            text.append(i);
        }
        return text;
    }
}
