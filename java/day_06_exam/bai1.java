public class bai1 {
    public static void main(String[] args) {
        printRectangle(4,4);
        printdelta(4);
    }
    public static void printRectangle(int row, int col) {
        for (int i=0;i< row;i++){
            for (int j=0;j< col;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
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
