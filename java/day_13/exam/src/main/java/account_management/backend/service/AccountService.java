package account_management.backend.service;

import account_management.backend.model.Account;
import account_management.backend.repository.AccountRepository;

public class AccountService {
private final AccountRepository accountRepository = new AccountRepository();
    public void changeUsername(Account account) {
        accountRepository.changeUsername(account);
    }
    public void changeEmail(Account account) {
        accountRepository.changeEmail(account);
    }
    public void changePassword(Account account) {
        accountRepository.changePassword(account);
    }

    public void logout() {
        accountRepository.logout();
    }

}
