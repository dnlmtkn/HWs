package org.example.e138;
class anotherClass {
       private void m(){
              System.out.println("private");
       }
       void m1(){
              System.out.println("default");
       }
       protected void m2(){
              System.out.println("protected");
       }
       public void m3(){
              System.out.println("public");
       }
}
public class E138AccessModifiers {
       public static void main(String[] args) {

              anotherClass o=new anotherClass();
              o.m1();
              o.m2();
              o.m3();



       }
}


