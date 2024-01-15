package day2;

import java.util.Scanner;

public class day2task2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a >= b) {
            System.out.println("Ошибка ввода");
        }
        for(int i = a; i < b; i++){
            if(i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
            }
            }
        }


