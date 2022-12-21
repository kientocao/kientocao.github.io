package exception_demo;

public class HandleExceptionDemo {
    public static void main(String[] args) {
         try {
             methodOne();
             methodTwo();
         } catch (ArithmeticException | NullPointerException e){
//             System.out.println(e.toString());
             System.out.println("Nhập lỗi rồi!");
             System.out.println(e.getMessage());
             e.printStackTrace();
         } finally {
             System.out.println("Finally");
         }
//         catch (NullPointerException e) {
//             System.out.println("Xử lý lỗi NullPointerException");
//         }
        System.out.println("Code continue...");
    }
    public static void methodOne() {
        int number =9 ;
        int zero = 0;
//        int result = number/zero;
        System.out.println(number/zero);
    }
    public static void methodTwo() {
        String str = null;
        System.out.println(str.length());
    }
}
