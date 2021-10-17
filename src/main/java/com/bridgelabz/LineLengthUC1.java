package com.bridgelabz;

import java.util.Scanner;

public class LineLengthUC1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        float x1,y1,x2,y2;

        System.out.println("Enter x1 y1 x2 y2: ");
        x1 = scanner.nextFloat();
        y1 = scanner.nextFloat();
        x2 = scanner.nextFloat();
        y2 = scanner.nextFloat();

        double length = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );
        System.out.println(length);

    }
}
