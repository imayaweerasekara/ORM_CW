package org.example.bo;

import org.example.bo.custom.impl.AcademicBOImpl;
import org.example.bo.custom.impl.AuthenticationaBOImpl;
import org.example.bo.custom.impl.RegistrationBOImpl;
import org.example.bo.custom.impl.StudentBOImpl;

public class BOFactory {
    public enum BOType {
        ACADEMIC, STUDENT, REGISTAION, AUTH
    }

    public static SuperBO getBO(BOType boType) {
        return switch (boType) {
            case ACADEMIC -> new AcademicBOImpl();
            case STUDENT -> new StudentBOImpl();
            case AUTH -> new AuthenticationaBOImpl();
            case REGISTAION -> new RegistrationBOImpl();
            default -> null;
        };


    }
}
