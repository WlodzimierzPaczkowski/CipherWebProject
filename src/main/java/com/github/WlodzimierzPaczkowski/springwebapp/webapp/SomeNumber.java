package com.github.WlodzimierzPaczkowski.springwebapp.webapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeNumber {
    private static int number;

    @Value("${NumberForSomeNumber}")
    public void setNumber(int number) {
        SomeNumber.number = number;
    }

    public static int getNumber() {
        return number;
    }


}
