package account_management.backend.controller;

import account_management.backend.model.Account;
import account_management.backend.service.ProgramService;

import java.util.List;
import java.util.Scanner;

public class ProgramController {
    private final ProgramService programService = new ProgramService();

    public void login(List<Account> accounts, Scanner scanner) {
        programService.login(accounts,scanner);
    }
    public void register(List<Account> accounts, Scanner scanner) {
        programService.register(accounts,scanner);
    }
    public void forgotPassword(List<Account> accounts, Scanner scanner){
        programService.forgotPassword(accounts,scanner);
    }
}
