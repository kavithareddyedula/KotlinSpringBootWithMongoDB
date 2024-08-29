package com.healthcare.service;

public class TestSingletonFromJava {

    public static final double stateTax = 2.1;

    public String greetings() {

        return "hi how are you";
    }

    public static void main() {
        String result = UserProfile.INSTANCE.getUserDetails(); // kotlin singleton object access
        System.out.println(result);
        TestSingletonFromJava obj = new TestSingletonFromJava();
        System.out.println(obj.greetings());
        System.out.println(stateTax);// direct using static variable in the static method
        System.out.println(TestSingletonFromJava.stateTax); // to access data
        KotlinObjectCompanionNullCheck obj2 = new  KotlinObjectCompanionNullCheck();
        System.out.println(obj2.addTwoIntegers(10,20));


    }

}
