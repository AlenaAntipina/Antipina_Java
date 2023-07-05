package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("TASK 1");
        task1();
        System.out.println("\nTASK 2");
        task2();
        System.out.println("\nTASK 3");
        task3();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int inputNumber = scanner.nextInt();
        if (inputNumber > 7) {
            System.out.println("Привет");
        }
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String inputName = scanner.next();
        System.out.println(inputName.equals("Вячеслав") ? "Привет, Вячеслав"
                : "Нет такого имени");
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элементы массива (через 1 пробел): ");
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(Arrays.stream(array).filter(element -> element % 3 == 0).toArray()));
    }
}