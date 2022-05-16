package lab;

import lab.visitors.Visitor;

public class IndividualUser implements BankUser {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitIndividualUser(this);
    }
}
