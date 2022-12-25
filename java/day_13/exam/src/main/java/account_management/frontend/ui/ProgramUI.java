package account_management.frontend.ui;

import account_management.backend.controller.ProgramController;
import account_management.backend.model.Account;

import java.util.List;
import java.util.Scanner;

import static account_management.backend.database.AccountDB.accounts;

public class ProgramUI {
    public void run() {
        ProgramController programController = new ProgramController();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        boolean isQuit = false;
        while (!isQuit) {
            showMenu();
            try {
                System.out.println("Nhập lựa chọn: ");
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn không hợp lệ");
                continue;
            }
            switch (option) {
                case 1: {
                    programController.login(accounts, scanner);
                    break;
                }
                case 2: {
                    programController.register(accounts, scanner);
                    break;
                }
                case 3: {

                    programController.forgotPassword(accounts, scanner);
                    break;
                }
                case 4: {
                    isQuit = true;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                }
            }
        }
    }

    private void showMenu() {
        System.out.println("\n------------MENU------------");
        System.out.println("1- Đăng nhập");
        System.out.println("2- Đăng kí ");
        System.out.println("3- Quên mật khẩu ");
        System.out.println("4 - Thoát\n");
    }
}
