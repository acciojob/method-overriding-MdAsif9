package com.driver;
class A{
    String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
       String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
  public static void main(String args[]){
   B ans=new B();
    System.out.println(ans.meth());
  }
}
