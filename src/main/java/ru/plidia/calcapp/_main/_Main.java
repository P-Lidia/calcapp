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
        ResultWriterService.print(number1, number2, result, "Сумма:", "+");
        result = Calculator.subtract(number1, number2);
        ResultWriterService.print(number1, number2, result, "Разность:", "-");
        result = Calculator.multiply(number1, number2);
        ResultWriterService.print(number1, number2, result, "Произведение:", "*");
    }
}


