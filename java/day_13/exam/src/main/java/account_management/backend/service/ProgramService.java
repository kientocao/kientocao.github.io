package account_management.backend.service;

import account_management.backend.model.Account;
import account_management.backend.repository.ProgramRepository;

import java.util.List;
import java.util.Scanner;

public class ProgramService {
    private final ProgramRepository programRepository = new ProgramRepository();

    public void login(List<Account> accounts, Scanner scanner) {
        programRepository.login(accounts,scanner);
    }

    public void register(List<Account> accounts, Scanner scanner) {
        programRepository.register(accounts,scanner);
    }

    public void forgotPassword(List<Account> accounts, Scanner scanner){
        programRepository.forgotPassword(accounts,scanner);
    }
}
