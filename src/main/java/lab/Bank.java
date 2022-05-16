package lab;

import lab.visitors.Visitor;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankUser> bankUsers = new ArrayList<>();

    public void addBankUser(BankUser bankUser) {
        bankUsers.add(bankUser);
    }

    public void accept(Visitor visitor) {
        for (BankUser bankUser: bankUsers) {
            bankUser.accept(visitor);
        }
    }
}
