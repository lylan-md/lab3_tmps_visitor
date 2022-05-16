package lab;

import lab.visitors.Visitor;

public class LegalUser implements BankUser {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitLegalUser(this);
    }
}
