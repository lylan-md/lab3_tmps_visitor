package lab.visitors;

import lab.IndividualUser;
import lab.LegalUser;

public interface Visitor {
    void visitIndividualUser(IndividualUser individualUser);
    void visitLegalUser(LegalUser legalUser);
}
