package ru.plidia.calcapp.util;

import ru.plidia.calcapp.service.ResultWriterService;

public class Calculator {
    public static void add(int num1, int num2){
        int sum = num1 + num2;
        String variable = "Сумма";
        ResultWriterService.print(num1, num2, sum, variable);
    }
    public static void subtract(int num1, int num2){
        int minus = num1 - num2;
        String variable = "Разность";
        ResultWriterService.print(num1, num2, minus, variable);
    }
    public static void multiply(int num1, int num2) {
        int multiply = num1 * num2;
        String variable = "Произведение";
        ResultWriterService.print(num1, num2, multiply, variable);
    }
}
