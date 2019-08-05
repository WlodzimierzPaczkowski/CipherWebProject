package com.github.WlodzimierzPaczkowski.springwebapp.webapp.services;

import com.github.WlodzimierzPaczkowski.springwebapp.webapp.backendLogic;
import org.springframework.stereotype.Service;

@Service
public class numberServiceImpl implements numberService {

    private int myNumber;

    public numberServiceImpl(){
        this.myNumber = backendLogic.getNumber();
    }

    @Override
    public int getNumber() {
        return myNumber;
    }
}
