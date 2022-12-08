import java.util.Arrays;

public class arrayPractice3 {
    public static void main(String[] args) {
       printRectangle(3,4);
        System.out.println();
        printRectangle(7,5);
        printEmptyRectangle(10,5);
        printX(9);
        printdelta(4);
    }

//    In hình chữ nhật
    public static void printRectangle(int row, int col) {
        for (int i=0;i< row;i++){
            for (int j=0;j< col;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    In hình chữ nhật rỗng
    public static void printEmptyRectangle(int row, int col) {
        for (int i=0;i< row;i++){
            for (int j=0;j< col;j++) {
               if (i==0||i== row-1||j==0||j==col-1) {
                   System.out.print("* ");
               } else {
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
//    In chữ X
    public static void printX(int side) {
        for (int i=0;i< side;i++){
            for (int j=0;j< side;j++) {
                if (i==j||(i+j)==side-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

//    In hình tam giác
    public static void printdelta (int h) {
        for (int i=0;i< h;i++){
            for (int j=0;j< h;j++) {
                if (i<j) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
