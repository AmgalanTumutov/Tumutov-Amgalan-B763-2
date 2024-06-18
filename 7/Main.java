/*
Тумутов Амгалан Б763-2
Вариант А
18. Продемонстрировать работу лямбда-выражения, которое получает входным параметром целое число x и вычисляет количество вхождений заданной цифры в этом числе.
*/

import java.util.function.BiFunction;
public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Long> countDigit = (x, digit) -> {
            return String.valueOf(x).chars()
                    .filter(ch -> ch == Character.forDigit(digit, 10))
                    .count();
        };
        int num = 123456789;
        int digitToCount = 7;
        long occurrences = countDigit.apply(num, digitToCount);
        System.out.println("Число вхождений цифры " + digitToCount + " в числе " + num + ": " + occurrences);
    }
}





