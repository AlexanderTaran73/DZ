package com.company;

public class Main {

    public static void main(String[] args) {

        Discriminant discriminant = (a, b, c) -> b*b-4*a*c;
        System.out.println(discriminant.calculate(1.0, 2.0, 1.0));
    }
    
}
