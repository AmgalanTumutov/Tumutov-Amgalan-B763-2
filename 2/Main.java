/*
Тумутов Амгалан Б763-2
Вариант А
1. Найти самое короткое и самое длинное число. Вывести найденные числа
и их длину.
*/

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = in.nextInt();
        int[] nums = new int[n];
        int max = nums[0];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int min = Arrays.stream(nums).min().getAsInt();
        int shortest = nums[0]+1;
        int longest = nums[0];
        for (int i = 0; i < n; i++) {
            var length = String.valueOf(nums[i]).length();
            if (length < shortest) {
                shortest = length;
            }
            if (length > longest) {
                longest = length;
            }
        }
        System.out.println("Самое короткое число: "+ min + "\n" + "Длина: " + shortest);
        System.out.println("Самое длинное число: "+ max + " \n"+ "Длина: " + longest);
    }
}
