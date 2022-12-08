import java.util.Arrays;
import java.util.Random;

public class arrayPractice1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbers()));
        System.out.println(String.join("",repeatString("a")));
        System.out.println(String.join("-",repeatString("a")));
        System.out.println(checkElementExist(3));
        System.out.println(randomHexCode());
        System.out.println(randomRgbCode());
 }
    public static int[] numbers(){
        int[] array = {4,2,5,6,2,7};
        for (int i=0; i<array.length;i++){
            if(array[i] % 2 == 0) {
                array[i] = 0;
            } else {
                array[i] =1;
            }
        }
        return array;
    }
    public static String[] repeatString(String text) {
        String[] Array = new String[10];
        int i;
        for(i=0;i<Array.length;i++){
            Array[i] = text;
        }
        return Array;
    }

    public static Boolean checkElementExist(int number) {
        int[] Array2 = {1,2,3,4,5};
        boolean a = false;
        for (int j =0; j<Array2.length; j++){
            if(Array2[j] == number) {
                a= true;
            }
            else {
                a= false;
            }
        }
        return a;
    }

    public static String randomHexCode() {
        Random rand = new Random();

        String hex[] = new String[6];
        for (int i = 0; i < 6; i++) {
            int hexCode = rand.nextInt(16);
            switch (hexCode) {
                case 10:
                    hex[i] = "a";
                    break;
                case 11:
                    hex[i] = "b";
                    break;
                case 12:
                    hex[i] = "c";
                    break;
                case 13:
                    hex[i] = "d";
                    break;
                case 14:
                    hex[i] = "e";
                    break;
                case 15:
                    hex[i] = "f";
                    break;
                default:
                    hex[i] = String.valueOf(hexCode);
                    break;
            }
        }
        String hex1 = String.join("", hex);
        return "#" + hex1;
    }

    public static String randomRgbCode() {
        String Rgb;
        int[] array = new int[3];
        for (int i =0; i<array.length;i++){
            array[i] = (int) Math.floor(Math.random()*256);
        }
        Rgb="rgb(" + array[0] +","+array[1]+","+array[2] +")";
         return Rgb;
    }
}
