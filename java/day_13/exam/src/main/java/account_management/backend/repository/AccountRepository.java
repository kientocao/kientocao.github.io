package account_management.backend.repository;

import account_management.backend.model.Account;
import account_management.frontend.ui.ProgramUI;

import java.util.Scanner;

public class AccountRepository {
    ProgramUI programUI = new ProgramUI();
    Scanner scanner = new Scanner(System.in);
    public void changeUsername(Account account) {
        System.out.println("Nhập username mới: ");
        String newUsername = scanner.nextLine();
        account.setUsername(newUsername);
    }
    public void changeEmail(Account account) {
        System.out.println("Nhập username mới: ");
        String newEmail = scanner.nextLine();
        account.setUsername(newEmail);
    }
    public void changePassword(Account account) {
        System.out.println("Nhập username mới: ");
        String newPassword = scanner.nextLine();
        account.setUsername(newPassword);
    }

    public void logout() {
        programUI.run();
    }
}
