package lab;

import lab.visitors.Visitor;

public interface BankUser {
    void accept(Visitor visitor);
}
