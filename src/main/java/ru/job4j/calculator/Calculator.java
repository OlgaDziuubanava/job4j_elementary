package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class Calculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractAndDivision(double first, double second) {
        return subtract(first, second)
                + division(first, second);
    }

    public static double allOperations(double first, double second) {
        return first + second;
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета1 равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета2 равен: " + subtractAndDivision(40, 10));
        System.out.println("Результат расчета3 равен: " + allOperations(sumAndMultiply(10, 20), subtractAndDivision(40, 10)));
    }

}
