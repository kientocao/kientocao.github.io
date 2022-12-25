package account_management.backend.controller;

import account_management.backend.model.Account;
import account_management.backend.service.AccountService;

import java.util.List;

public class AccountCotroller {
    public AccountService accountService = new AccountService();
    public void changeUsername(Account account) {
        accountService.changeUsername(account);
    }
    public void changeEmail(Account account) {
        accountService.changeEmail(account);
    }
    public void changePassword(Account account) {
       accountService.changePassword(account);
    }
    public void logout() {
        accountService.logout();
    }

}

