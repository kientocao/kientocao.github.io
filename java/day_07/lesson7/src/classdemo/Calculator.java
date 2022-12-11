package classdemo;

public class Calculator {
    public int number1;
    public int number2;
    public void printInfo(){
        System.out.println("Hai số number 1 và number 2 là:" + number1 +", " + number2);
    }
    public int addition() {
        return number1+number2;
    }
    public int subtract() {
        return number1-number2;
    }
    public int multi() {
        return number1*number2;
    }
    public double division() {
        double result = 0;
        try {
            result = (double) (number1/number2);
            return result;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
//            Lấy ra thông tin lỗi
            e.printStackTrace();
//            in ra thành phần lỗi ở đâu, chỗ nào
//            In ra lỗi nhưng vẫn tiếp tục chạy
        }
        return result;
//        if (number2 == 0) {
//            System.out.println("Không chia được cho 0");
//        }
//        return (double) number1/number2;
    }
}
