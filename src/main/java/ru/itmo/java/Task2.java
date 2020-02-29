package ru.itmo.java;

import java.math.BigDecimal;

@SuppressWarnings("all")
public class Task2 {

    /**
     * Дано произвольное вещественное число. Выведите его дробную часть
     * <p>
     * Например
     * - дано 17.9
     * - вывод 0.9
     */
    double getFractionalPart(double realNumber) {
        int realNumberInt  = (int)realNumber;
        double result = realNumber - realNumberInt;
        return result;
    }

    /**
     * Дан символ, верните его код. Не используйте явное приведение типов и любые библиотечные функции
     */
    int charCode(char c) {
        return (int)c;
    }

    /**
     * Даны 2 целых числа. Проверьте равны ли они
     */
    boolean testIfIntsEqual(Integer a, Integer b) {
        if (a.equals(b)) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Дано целое число. Выведите {@code true}, если оно входит в заданный диапазон или {@code false}
     * в иных случаях
     *
     * @param number      заданное число
     * @param leftBound   правая граница диапазона
     * @param rightBound  верхняя граница диапазона
     * @param inclusively входят ли границы в заданный даипазон
     */
    boolean numberInRange(Integer number, Integer leftBound, Integer rightBound, Boolean inclusively) {
        if(number == null || leftBound == null || rightBound == null || inclusively == null) {
            return  false;
        }
        else{
            if (number >= leftBound && number <= rightBound && inclusively == true) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    /**
     * Даны 3 символа. Определите является ли хотя бы один из них цифрой 1..9
     */
    boolean atLeastOneIsDigit(char c1, char c2, char c3) {
        //49..57
        int intC1 = (int)c1;
        int intC2 = (int)c2;
        int intC3 = (int)c3;
        if ((intC1 < 58 && intC1 > 47) || (intC2 < 58 && intC2 > 47) || (intC3 < 58 && intC3 > 47)) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Даны два вещественных числа. Определите равны ли они
     */
    boolean areRealNumbersEqual(double a, double b) {
        if(a - b < 0.0001) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Дано трехзначное число 100 <= N <= 999. Найдите сумму его чисел.
     */
    int sumOfDigits(int n) {
        int sum = (n % 10) + (n / 10) % 10 + (n / 100) % 10;
        return sum;
    }

    /**
     * Дано натуральное число N <= 10000. Выведите следующее после N четное число. Например: N = 8, Result = 10
     */
    int nextEvenNumber(int n) {
        int result;
        if (n % 2 == 0) {
            result = n + 2;
        }
        else {
            result = n + 1;
        }
        return result;
    }

    /**
     * Школа №32 решила создать 3 дополнительных физмат класса и укомплектовать кабинеты новыми партами.
     * За одной партой может сидеть 2 ученика. Кол-во учеников в каждом из классов известно (num1, num2, num3).
     * Выведите минимальное кол-во парт, которые нужно приобрести школе, при условии что каждый из классов сидит в
     * своем кабинете
     */
    int schoolDesks(int num1, int num2, int num3) {
        int sum = 0;
        int result1 = num1 / 2;
        int result2 = num2 / 2;
        int result3 = num3 / 2;
        if(num1 - result1 * 2 > 0) {
            sum++;
        }
        if(num2 - result2 * 2 > 0) {
            sum++;
        }
        if(num3 - result3 * 2 > 0) {
            sum++;
        }
        return sum + result1 + result2 + result3;
    }

    /**
     * Дано натуральное число N >= 10. Выведите результат применения XOR к последним 2-м цифрам числа N
     */
    int xorDigits(int N) {
        int a1 = N % 10;
        int a2 = (N / 10) % 10;
        int result = a1 ^ a2;
        return result;
    }

}
