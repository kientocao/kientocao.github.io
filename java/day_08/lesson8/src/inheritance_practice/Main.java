package inheritance_practice;

import encapsolution_pactice.Test;

public class Main {
    public static void main(String[] args) {
        Deverloper dev = new Deverloper(100,"kien", 29, "0334398498", "a123kien",6000,200);
        Tester tester = new Tester();
        System.out.println(dev);
        System.out.println(tester);
    }
}
