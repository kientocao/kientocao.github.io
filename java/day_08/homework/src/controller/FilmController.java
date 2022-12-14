package controller;

import service.FilmService;

import java.util.Scanner;

public class FilmController {
    public FilmService filmService = new FilmService();
    public void run(){
        Scanner sc = new Scanner(System.in);
        int option = 0;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();

            System.out.print("Nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: {
                    System.out.print("Thông tin các bộ phim : ");
                    filmService.printFilm();
                    break;
                }
                case 2: {
                    System.out.print("Nhập tiêu đề cần tìm : ");
                    String title = sc.nextLine();
                    filmService.findByTitle(title);
                    break;
                }
                case 3: {
                    isQuit = true;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
                }
            }
        }
    }
    public static void showMenu() {
        System.out.println("\n********* MENU *********");
        System.out.println("1 - Tìm kiếm theo tên");
        System.out.println("2 - Tìm kiếm theo thể loại");
        System.out.println("3 - Thoát");
    }
}
