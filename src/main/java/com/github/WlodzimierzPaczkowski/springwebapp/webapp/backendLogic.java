package com.github.WlodzimierzPaczkowski.springwebapp.webapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class backendLogic {
    private static int  number;

    @Value("3")
    public void setNumber(int number) {
        this.number = number;
    }

    public static int getNumber() {
        return number;
    }


}
