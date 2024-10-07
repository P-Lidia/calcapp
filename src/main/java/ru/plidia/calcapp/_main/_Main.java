package ru.plidia.calcapp._main;

import ru.plidia.calcapp.service.ResultWriterService;
import ru.plidia.calcapp.util.Calculator;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int var1 = sc.nextInt();
        System.out.println("Введите второе число");
        int var2 = sc.nextInt();
        int res1 = Calculator.add(var1, var2);
        String variable1 = "Сумма:";
        ResultWriterService.print(var1, var2, res1, variable1, "+");
        int res2 = Calculator.subtract(var1, var2);
        String variable2 = "Разность:";
        ResultWriterService.print(var1, var2, res2, variable2, "-");
        int res3 = Calculator.multiply(var1, var2);
        String variable3 = "Произведение:";
        ResultWriterService.print(var1, var2, res3, variable3, "*");
    }
}


