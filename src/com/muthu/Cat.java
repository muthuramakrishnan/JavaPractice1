package com.muthu;

public class Cat extends Pet{

    @Override
    public String toString() {
        return "Cat: {name: mycat}";
    }

    //    public String toString() {
//        //by default if you don't override it, it will call the super class method
//        return super.toString();
//    }

    public static void main(String[] args){
        Cat c = new Cat();
        c.setName("my cat");
        System.out.println(c);
    }
}
