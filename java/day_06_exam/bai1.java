public class bai1 {
    public static void main(String[] args) {
        printSquare(4);
        System.out.println();
        printdelta(4);
    }
    public static void printSquare(int a) {
        for (int i=0;i< a;i++){
            for (int j=0;j< a;j++) {
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
