package ru.sky.pro;

public class Main {
        public static void main(String[] args) {
        }
    int[] knigaRashodov = generateRandomArray();

    public static int[] generateRandomArray() {

        // создание массива случайных чисел
        java.util.Random random = new java.util.Random();
        int[] knigaRashodov = new int[30];
        for (int i = 0; i < knigaRashodov.length; i++) {
            knigaRashodov[i] = random.nextInt(100_000) + 100_000;
        }
        return knigaRashodov;
    }

        {    //Задание 1
    System.out.println("Задание 1");



    }


}





