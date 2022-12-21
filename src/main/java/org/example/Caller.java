package org.example;

public class Caller {
    private String nameOfCaller;
    private String numberOfCaller;


    Caller(String nameOfCaller, String numberOfCaller){
        this.nameOfCaller = nameOfCaller;
        this.numberOfCaller = numberOfCaller;
    }

    public String getNameOfCaller() {
        return nameOfCaller;
    }

    public String getNumberOfCaller() {
        return numberOfCaller;
    }

    @Override
    public String toString(){
        return this.nameOfCaller + " " + this.numberOfCaller;
    }

}
