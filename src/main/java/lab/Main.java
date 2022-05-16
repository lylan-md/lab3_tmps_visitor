package lab;

import lab.visitors.ConsoleVisitor;
import lab.visitors.JsonVisitor;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addBankUser(new IndividualUser());
        bank.addBankUser(new IndividualUser());
        bank.addBankUser(new LegalUser());

        bank.accept(new ConsoleVisitor());
        bank.accept(new JsonVisitor());
    }
}
