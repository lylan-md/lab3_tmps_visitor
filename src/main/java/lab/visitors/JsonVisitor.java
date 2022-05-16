package lab.visitors;

import com.google.gson.JsonObject;
import lab.IndividualUser;
import lab.LegalUser;

public class JsonVisitor implements Visitor {

    @Override
    public void visitIndividualUser(IndividualUser individualUser) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("className", individualUser.getClass().getName());
        System.out.println(jsonObject.toString());
    }

    @Override
    public void visitLegalUser(LegalUser legalUser) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("className", legalUser.getClass().getName());
        System.out.println(jsonObject.toString());
    }
}
