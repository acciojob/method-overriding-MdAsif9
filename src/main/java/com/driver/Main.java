package com.driver;

public class Main {
    public static class A{
        String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A {
        String meth(){
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String args[]){
      B ans=new B();

        ans.meth();
        B ans1 =new B();
        ans1.meth();
  }
}
