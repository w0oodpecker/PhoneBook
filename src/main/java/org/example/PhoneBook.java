package org.example;

import java.util.HashMap;

public class PhoneBook {

    public HashMap<String, String> callersMap = new HashMap<>();

    public int add(String nameOfCaller, String numberOfCaller){
        if(callersMap.putIfAbsent(nameOfCaller, numberOfCaller) == null){
            return callersMap.size();
        }
        return 0; //Возвращается 0 если запись не добавлена
    }


    public String findByNumber(String numberOfCaller){
        return null;
    }

}
