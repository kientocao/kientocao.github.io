package account_management.frontend.ui;

import account_management.backend.controller.AccountCotroller;
import account_management.backend.model.Account;

import java.util.List;
import java.util.Scanner;

public class AccountUI {
    AccountCotroller accountController = new AccountCotroller();
    public void run(Account account) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        boolean isQuit = false;
        while (!isQuit) {
            showMenu();
            try {
                System.out.println("Nhập lựa chọn");
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn không hợp lệ");
                continue;
            }
            switch (option) {
                case 1: {
                    accountController.changeUsername(account);
                    break;
                }
                case 2: {
                    accountController.changeEmail(account);
                    break;
                }
                case 3: {
                    accountController.changePassword(account);
                    break;
                }
                case 4: {
                    accountController.logout();
                    System.out.println("Đăng xuất thành công ");
                    break;
                }
                case 5: {
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
        System.out.println("1- Thay đổi username");
        System.out.println("2- Thay đổi email ");
        System.out.println("3- Thay đổi mật khẩu ");
        System.out.println("4- Đăng xuất ");
        System.out.println("5 - Thoát\n");
    }
}
