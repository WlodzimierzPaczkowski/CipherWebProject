package com.github.WlodzimierzPaczkowski.springwebapp.webapp.services;

import com.github.WlodzimierzPaczkowski.springwebapp.webapp.CipherModel;
import org.springframework.stereotype.Service;

@Service
public class StringServiceImpl implements StringService {
    private String cipherName;
    private String cipherDifficulty;

    public StringServiceImpl() {
        this.cipherName = CipherModel.getCipherName();
        this.cipherDifficulty = CipherModel.getDecipherDifficulty();
    }
///////////// WIP /////////////
    @Override
    public String getString() {
        return cipherName;
    }

    public String getString2(){
        return cipherDifficulty;
    }
}
