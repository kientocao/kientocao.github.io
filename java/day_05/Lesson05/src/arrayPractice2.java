import java.util.Arrays;
import java.util.Scanner;

public class arrayPractice2 {
    public static void main(String[] args) {
        int[][] numbersOther = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i=0; i<numbersOther.length; i++) {
            System.out.println(Arrays.toString(numbersOther[i]));
            for (int j=0;j<numbersOther.length;j++) {
                System.out.println(numbersOther[i][j]);
            }
        }
        for (int[] row: numbersOther ) {
            for (int number:row){
                System.out.println(number);
            }
        }
//        Giá sách
//        1 chiều: Lặp qua từng quyển sách
//        2 chiều: Lặp qua từng quyển sách, mỗi quyển sách lặp qua từng trang sách
//        3 chiều: Lặp qua từng quyển sách, mỗi quyển sách lặp qua từng trang sách, mỗi trang sách lặp qua từng dòng
        Scanner sc = new Scanner((System.in));
        System.out.println("Nhập vào số hàng: ");
        int row = sc.nextInt();
        System.out.println("Nhập vào số cột: ");
        int col = sc.nextInt();
        int[][] array = new int[row][col];
        for (int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập vào phần tử [" +i +"] " + "[" + j+ "]: ");
                array[i][j] = sc.nextInt();
            }
        }
        for (int[] subArray:array) {
            for(int number:subArray) {
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}
