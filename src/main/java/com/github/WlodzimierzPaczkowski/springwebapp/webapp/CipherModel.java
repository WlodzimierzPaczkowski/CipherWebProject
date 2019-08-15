package com.github.WlodzimierzPaczkowski.springwebapp.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CipherModel {

    private static String cipherName;
    private static String decipherDifficulty;

    public static String getCipherName() {
        return cipherName;
    }

    public static String getDecipherDifficulty() {
        return decipherDifficulty;
    }

    @Value("${CipherType}")
    public void setCipherName(String cipherName) { CipherModel.cipherName = cipherName;}
    @Value("${CipherBreakDifficulty}")
    public void setDecipherDifficulty(String decipherDifficulty) {
        CipherModel.decipherDifficulty = decipherDifficulty;
    }


}
