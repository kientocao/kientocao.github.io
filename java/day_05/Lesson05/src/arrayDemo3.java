public class arrayDemo3 {
    public static void main(String[] args) {
        String [] names = {"Nguyen van A", "Tran Van B", "Ngo Thi C"};
//        for(int i=0; i<names.length; i++) {
//            System.out.println(names[i]);
//        }
        int i=0;
        while (i < names.length) {
            System.out.println(names[i]);
            i++;
        }
//        Duyệt qua giá trị của mảng
        for (String name: names
             ) {
            System.out.println(name);
        }
        for (var name: names){
            System.out.println(name);
        }
        int[] numbers = {1,2,3,4,5};
        int sum =0;
        for (int number: numbers) {
            sum+=number;
        }
        System.out.println("Sum = " +sum);
    }
}
