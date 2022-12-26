package account_management.backend.repository;

import account_management.backend.database.AccountDB;
import account_management.backend.model.Account;
import account_management.backend.utils.FileUtils;
import account_management.frontend.ui.AccountUI;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ProgramRepository {
    AccountUI accountUI = new AccountUI();
    AccountRepository accountRepository = new AccountRepository();
    public void login(List<Account> accounts, Scanner scanner) {
        boolean isExists = false;
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        System.out.println("Nhập password: ");
        String password = scanner.nextLine();
        for (Account account : accounts) {
            if (email.equals(account.getEmail()) && password.equals(account.getPassword())) {
                System.out.println("Chào mừng " + account.getUsername() + "! Bạn có thể thực hiện các công việc sau:");
                accountUI.run(account);
                isExists = true;
            }
        }
        if (!isExists) {
            System.out.println("Tài khoản hoặc mật khẩu không chính xác!");
        }
    }


    public void register(List<Account> accounts, Scanner scanner) {
        System.out.print("Nhập username cần đăng kí: ");
        String username = scanner.next();

        System.out.print("Nhập email cần đăng kí: ");
        String email = scanner.next();

        boolean isExists = false;
        for (Account account : accounts) {
            if (email.equals(account.getEmail())) {
                isExists = true;
            }
        }
        if (isExists) {
            System.out.println("Email đã tồn tại!");
        } else {
            // Kiểm tra email có đúng định dạng email không
            Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
            if (pattern.matcher(email).matches()) {
                System.out.print("Nhập mật khẩu: ");
                String password = scanner.next();

                // Kiểm tra độ dài mật khẩu
                if (password.length() >= 7 && password.length() <= 15) {
                    accounts.add(new Account(username, email, password));
                    FileUtils.setDataToFile("accounts.json", accounts);
                    System.out.println("Đăng ký thành công!");
                } else {
                    System.out.println("Mật khẩu phải có độ dài từ 7 đến 15 ký tự!");
                }
            } else {
                System.out.println("Email không hợp lệ!");
            }
        }
    }

    public void forgotPassword(List<Account> accounts, Scanner scanner)  {
            System.out.print("Nhập email cần lấy lại mật khẩu: ");
            String email = scanner.nextLine();
            boolean isExist = false;
            try {
                isExist = validateEmail(email);
            } catch (Exception e) {
                System.out.println("Email không đúng định dạng.");
            }
            if (isExist) {
                for (Account a : accounts) {
                    if (a.getEmail().equals(email)) {
                        String newPassword;
                        do {
                            System.out.println("Nhập mật khẩu mới: ");
                            newPassword = scanner.nextLine();
                        }
                        while (!validatePassword(newPassword));
                        a.setPassword(newPassword);
                        FileUtils.setDataToFile("accounts.json", AccountDB.accounts);
                    }
                }
            } else {
                System.out.println("Email không tồn tại trong hệ thống");
            }
        }

        private static boolean validateEmail(String email) throws Exception {
            String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                return true;
            } else {
                throw new Exception("Email không đúng định dạng");
            }
        }
        private static boolean validatePassword(String password) {
            if (password.length() < 7 || password.length() > 15) {
                System.out.println("Mật khẩu phải có độ dài từ 7 đến 15 ký tự");
            } else {
                System.out.println("Mật khẩu của bạn đã được thay đổi thành công");
                return true;
            }
            return false;
        }
    }

