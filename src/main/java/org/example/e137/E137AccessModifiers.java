package org.example.e137;

public class E137AccessModifiers {

    String name;
    private String city;
    protected String nameOfSchool;
    public String batchNumber;

    void meth(){
        System.out.println("My name is "+name+" and I live in "+city+". I study at "+nameOfSchool+" in batch "+batchNumber);
    }
    public static void main(String[] args) {

        E137AccessModifiers o=new E137AccessModifiers();
        o.name="John";
        o.city="Miami";
        o.nameOfSchool="Syntax";
        o.batchNumber="9";

        o.meth();

    }
}

