package day3;

import java.util.Scanner;

public class day3task3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while(i < 5){
            double num1 = scan.nextDouble();
            double num2 = scan.nextDouble();
            if (num2 == 0){
                System.out.println("Деление на 0");
                continue;}
            System.out.println(num1 / num2);
            i++;
        }
    }
}
