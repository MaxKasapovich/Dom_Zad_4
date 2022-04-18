package com.company;

public class Main {

    public static void main(String[] args) {
        Part1 part1 = new Part1();
        part1.x1 = 2;
        part1.x2 = 4;
        part1.phrase = "Периметр равен площади:";
        part1.dataResults();
        part1.compare();
        part1.printInfo();

        Part2 part2 = new Part2();
        part2.b = 100;
        part2.i2 = 1_000_000;
        part2.s2 = 18666;
        part2.c = 88;
        part2.transform();
        part2.printInfo();

        Part3 part3 = new Part3();
        part3.i = 2_147_483_647;
        part3.transform2();
        part3.printInfo();

        Part4 part4 = new Part4();
        part4.bmax = 127;
        part4.increment();
        part4.printInfo();

    }
}

