package org.example;

import java.util.HashMap;

public class PhoneBook {

    public HashMap<String, String> callersMap = new HashMap<>();

    public boolean add(String nameOfCaller, String numberOfCaller){
        if(callersMap.putIfAbsent(nameOfCaller, numberOfCaller) == null){
            return true;
        }
        return false;
    }
}
