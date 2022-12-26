package account_management.backend.repository;

import account_management.backend.database.AccountDB;
import account_management.backend.exception.NotFoundException;
import account_management.backend.model.Account;
import account_management.backend.request.UpdateAccountRequest;
import account_management.backend.utils.FileUtils;
import account_management.frontend.ui.ProgramUI;

import java.util.Scanner;

public class AccountRepository {
    ProgramUI programUI = new ProgramUI();
    Scanner scanner = new Scanner(System.in);

    public void changeUsername(Account account) {
        System.out.println("Nhập username mới: ");
        String newUsername = scanner.nextLine();
        account.setUsername(newUsername);
        FileUtils.setDataToFile("accounts.json", AccountDB.accounts);
    }
    public void changeEmail(Account account) {
        System.out.println("Nhập email mới: ");
        String newEmail = scanner.nextLine();
        account.setEmail(newEmail);
        FileUtils.setDataToFile("accounts.json", AccountDB.accounts);
    }
    public void changePassword(Account account) {
        System.out.println("Nhập Password mới: ");
        String newPassword = scanner.nextLine();
        account.setPassword(newPassword);
        FileUtils.setDataToFile("accounts.json", AccountDB.accounts);
    }

    public void logout() {
        programUI.run();
    }
    public boolean quit(){
        return true;
    }
}
