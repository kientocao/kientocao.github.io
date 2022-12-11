package StaticDemo;

public class test {
    public static void main(String[] args) {
//        biến, method static thuộc về class chứ không thuộc về đối tượng
        System.out.println(Film.category);
        Film.methodStatic();
        Film film = new Film();
//        phương thức static k cần khởi tạo
        film.methodNormal();
        System.out.println(Film.category);
    }
//    định nghĩa một lần không cần khởi tạo lại, biến static được dùng chung giống String literal lưu trong String pool, chỉ trỏ đến địa chỉ ô nhớ
}
