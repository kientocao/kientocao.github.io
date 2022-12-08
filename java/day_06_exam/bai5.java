import java.util.Arrays;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng: ");
        int row = sc.nextInt();
        System.out.println("Nhập số cột của mảng: ");
        int col = sc.nextInt();
        int [][] arrayA = new int[row][col];
        for (int i=0;i<row;i++)
            for (int j=0;j<col;j++){
                System.out.print("Nhập phần tử ["+i+"]["+j +"] của mảng A: ");
                arrayA[i][j] = sc.nextInt();
            }
        System.out.println("Mảng nhận được là:" );
        for (int i=0; i<arrayA.length; i++) {
            System.out.println(Arrays.toString(arrayA[i]));
            for (int j=0;j<arrayA.length;j++) {
            }
        }
        System.out.println("Các phần tử nằm trên đường chéo chính là: ");
        for (int i=0; i<arrayA.length; i++) {
            for (int j=0;j<arrayA.length;j++) {
                if(i==j) {
                    System.out.print(arrayA[i][j]+" ");
                }
            }
        }
        int [][] arrayB = new int[row][col];
        System.out.println("\n");
        for (int i=0;i<row;i++)
            for (int j=0;j<col;j++){
                System.out.print("Nhập phần tử ["+i+"]["+j +"] của mảng thứ B: ");
                arrayB[i][j] = sc.nextInt();
            }
        int [][] arrayC = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arrayC[i][j] = arrayA[i][j] + arrayB[i][j];
            }
        }

        // hiển thị ma trận tổng C
        System.out.print("Ma trận tổng C: \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arrayC[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
