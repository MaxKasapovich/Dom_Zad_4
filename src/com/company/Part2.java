package com.company;

public class Part2
{
    byte b;
    short s1;
    int i1;
    long l;
    int i2;
    double d1;
    short s2;
    float f;
    double d2;
    char c;
    int i3;


    public void transform() {
    s1 = b;
    i1 = s1;
    l = i1;

    d1 = i2;

    f = s2;
    d2 = f;

    i3 = c;

    }
public void printInfo(){
    System.out.println("Byte: " + b);
    System.out.println("Short1: " + s1);
    System.out.println("Integer1: " + i1);
    System.out.println("Long: " + l);
    System.out.println("Integer: " + i2);
    System.out.println("Double1: " + d1);
    System.out.println("Short2: " + s2);
    System.out.println("Float: " + f);
    System.out.println("Double2:" + d2);
    System.out.println("Char:" + c);
    System.out.println("Integer3: "+ i3);
}
}
