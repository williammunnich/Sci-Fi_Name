package com.swcompsci;

public class main {
public static void main(String[] args){
    String mutateFirst= "";
    String mutateSecond= "";
    String ex1 = "william";
    String ex2 = "munnich";
    String ex3 = "minneapolis";
    String ex4 = "anwatin";
    mutateFirst += ex1.substring(0,4) + ex2.substring(0,3);
    mutateSecond += ex3.substring(0,3) + ex4.substring(0,4);
    System.out.print("first name:");
    System.out.println(mutateFirst);
    System.out.println("last name:");
    System.out.println(mutateSecond);
}
}