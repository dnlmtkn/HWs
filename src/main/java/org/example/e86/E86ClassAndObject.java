package org.example.e86;

import javax.xml.namespace.QName;

public class E86ClassAndObject {
    public static void main(String[] args) {

        class Student {

            String name;
            int roll_no;

        }

        Student s1 = new Student();
        s1.name = "John";
        s1.roll_no = 2;
        System.out.println("Name is " + s1.name + " and roll number is " + s1.roll_no);


    }
}
