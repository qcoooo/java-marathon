package day2;

import java.util.Scanner;

public class day2task4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        if (x >= 5){
            double result1 = (x * x - 10) / x + 7;
            System.out.println(result1);
        }
        else if(-3 < x && x < 5){
            double result2 = (x+3) * (x * x - 2);
            System.out.println(result2);
        }
        else{
            System.out.println(420);
        }
    }
}
