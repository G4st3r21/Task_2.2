package ru.vsu.cs.PoryadinAV;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SimpleLinkedList.SimpleLinkedListException {
        SpecialListSorting sorting = new SpecialListSorting();
        SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();

        int length = inputListLength();
        boolean isRandom = inputRandomQuestion();
        setIntegers(list, length, isRandom);

        System.out.println("Сгенерированный список:");
        printLinkedList(list);

        SimpleLinkedList<Integer> newList = sorting.specialSorting(list);

        System.out.println("Отсортированный список:");
        printLinkedList(newList);
    }

    public static int inputListLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину списка (длина должна быть кратна 3): ");

        return scanner.nextInt();
    }

    public static boolean inputRandomQuestion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Заполнить список случайным образом(True) или последовательно(False)?: ");

        return scanner.nextBoolean();
    }

    public static void setIntegers(SimpleLinkedList<Integer> list, int range, boolean isRandom) {
        Random random = new Random();

        for (int i = 0; i < range; i++) {
            if (isRandom) {
                list.addLast(random.nextInt(10));
            } else {
                list.addLast(i);
            }
        }
    }


    public static void printLinkedList(SimpleLinkedList<Integer> list) {
        for (Integer number : list) {
            System.out.print(number);
            System.out.print(" ");
        }
        System.out.println();
    }
}
