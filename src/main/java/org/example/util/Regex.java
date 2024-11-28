package org.example.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean isTextFieldValid(TextField textField,String text){
        String field = switch (textField){
            case NAME -> "^[A-Za-z]+(?: [A-Za-z]+)*$";
            case ADDRESS -> "^([A-z0-9]|[-\\,.@+]|\\\\s){4,}$";
            case TEL -> "^[0]([1-9]{2})([0-9]){7}$";
            case MONTH -> "^[0-9]{1,5}$";
            case PRICE -> "^([0-9]){1,}[.]([0-9]){1,}$";
            case STUDENTID -> "^S\\d{3}$";
            case PROGRAMID -> "^CA\\d{4}$";
        };
        Pattern pattern=Pattern.compile(field);

        if (text!= null){
            if (text.trim().isEmpty()){
                return false;
            }
        }else {
            return false;
        }

        Matcher matcher=pattern.matcher(text);

        if (matcher.matches()){
            return true;
        }
        return false;
    }

    public static boolean setTextColor(TextField location, javafx.scene.control.TextField textField){
        if (Regex.isTextFieldValid(location, textField))
    }
}
