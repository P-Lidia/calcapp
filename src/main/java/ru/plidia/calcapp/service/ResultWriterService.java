package ru.plidia.calcapp.service;

public class ResultWriterService {
    public static void print(int num1, int num2, int result, String operation, String sign) {
        System.out.println(operation + " " + num1 + " " + sign + " " + num2 + " = " + result);
    }
}
