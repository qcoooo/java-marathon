package day3;

import java.util.Scanner;


public class day3task2 {
    public static void main(String[] args){


    Scanner scan = new Scanner(System.in);
    while(true) {
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        if (num2 == 0)
            break;
        System.out.println(num1 / num2);

    }    }
}

