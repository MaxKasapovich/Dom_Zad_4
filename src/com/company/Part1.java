package com.company;

public class Part1 {

    int x1;
    int x2;
    int S1;
    int S2;
    int P1;
    int P2;
    boolean comparition1;
    boolean comparition2;
    String phrase;

    public void dataResults() {
        S1 = x1 * x1;
        S2 = x2 * x2;

        P1 = x1 * 4;
        P2 = x2 * 4;

        comparition1 = S1 == P1;
        comparition2 = S2 == P2;
    }
    public void printInfo() {
        System.out.println("Square 1 = " + S1);
        System.out.println("Square 2 = " + S2);
        System.out.println("Perimeter 1 = " + P1);
        System.out.println("Perimeter 2 = " + P2);
        System.out.println(phrase + " " + comparition1);
        System.out.println(phrase + " " + comparition2);
    }
    public void compare() {comparition1 = S1 == P1;comparition2 = S2 == P2;}
}
