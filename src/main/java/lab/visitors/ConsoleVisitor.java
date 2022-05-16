package lab.visitors;

import lab.IndividualUser;
import lab.LegalUser;

public class ConsoleVisitor implements Visitor {
    @Override
    public void visitIndividualUser(IndividualUser individualUser) {
        System.out.println(individualUser.getClass().getName());
    }

    @Override
    public void visitLegalUser(LegalUser legalUser) {
        System.out.println(legalUser.getClass().getName());
    }
}
