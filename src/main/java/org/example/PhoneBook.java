package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {

    public HashMap<String, String> callersMap = new HashMap<>();

    public int add(String nameOfCaller, String numberOfCaller){
        if(callersMap.putIfAbsent(nameOfCaller, numberOfCaller) == null){
            return callersMap.size();
        }
        return 0; //Возвращается 0 если запись не добавлена
    }


    public String findByNumber(String numberOfCaller){
        Map<String, String> swapped = callersMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        return swapped.get(numberOfCaller);
    }

    public String findByName(String nameOfCaller){
        return callersMap.get(nameOfCaller);
    }

    public String[] printAllNames(){
        Map<String, String> sorted = callersMap.entrySet().stream().collect(Collectors.
                toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> newValue, TreeMap::new));
        String[] listOfNames = sorted.keySet().toArray(new String[0]);
        Arrays.stream(listOfNames).forEach(System.out::println);
        return listOfNames;
    }

}
