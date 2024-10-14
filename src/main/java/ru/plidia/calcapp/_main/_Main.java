package ru.plidia.calcapp._main;

import ru.plidia.calcapp.service.ResultWriterService;
import ru.plidia.calcapp.util.Calculator;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = sc.nextInt();
        System.out.println("Введите второе число");
        int number2 = sc.nextInt();
        int result = Calculator.add(number1, number2);
        String variable1 = "Сумма:";
        ResultWriterService.print(number1, number2, result, variable1, "+");
        result = Calculator.subtract(number1, number2);
        String variable2 = "Разность:";
        ResultWriterService.print(number1, number2, result, variable2, "-");
        result = Calculator.multiply(number1, number2);
        String variable3 = "Произведение:";
        ResultWriterService.print(number1, number2, result, variable3, "*");
    }
}


