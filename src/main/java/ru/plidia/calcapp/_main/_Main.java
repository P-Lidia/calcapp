package ru.plidia.calcapp._main;

import ru.plidia.calcapp.util.Calculator;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int var1 = sc.nextInt();
        System.out.println("Введите второе число");
        int var2 = sc.nextInt();
        Calculator.add(var1, var2);
        Calculator.subtract(var1, var2);
        Calculator.multiply(var1, var2);
    }
}


