package org.example.e136;

public class E136AccessModifiers {

    private void m(){
        System.out.println("This is Private Method");
    }
    void m1(){
        System.out.println("This is Default Method");
    }
    protected void m2(){
        System.out.println("This is Protected Method");
    }
    public void m3(){
        System.out.println("This is Public Method");
    }


    public static void main(String[] args) {

        E136AccessModifiers o=new E136AccessModifiers();

        o.m();
        o.m1();
        o.m2();
        o.m3();

    }
}


