package com.swcompsci;
import java.util.Scanner;

public class main {
public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("First Name?");
    String ex1 = userInput.nextLine();
    System.out.println("Last Name?");
    String ex2 = userInput.nextLine();
    System.out.println("City of birth?");
    String ex3 = userInput.nextLine();
    System.out.println("Middle school?");
    String ex4 = userInput.nextLine();
    System.out.println("Relative name?");
    String ex5 = userInput.nextLine();
    System.out.println("Friend name?");
    String ex6 = userInput.nextLine();
    userInput.close();

    String mutateFirst= "";
    String mutateSecond= "";
    String mutateThird= "";
    mutateFirst += ex1.substring(0,4) + ex2.substring(0,3);
    mutateSecond += ex3.substring(0,3) + ex4.substring(0,4);
    mutateThird += randnamefromname.nameout1(ex5) + randnamefromname.nameout1(ex6);
    System.out.println("first name:");
    System.out.println(mutateFirst);
    System.out.println("last name:");
    System.out.println(mutateSecond);
    System.out.println("Scifi origin:");
    System.out.println(mutateThird);

    System.out.println("Hello " + mutateFirst+ " " + mutateSecond + " of " + mutateThird+ ". Welcome!");
}
}