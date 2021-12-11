package ru.sky.pro;

public class Main {
    public static void main(String[] args) {

        //создать массив произвольных чисел и использовать в работе его у меня так и не получилось

        // создание массива неслучайных чисел
        int[] arr = new int[30];
        arr[0] = 174_276;
        arr[1] = 163_112;
        arr[2] = 184_494;
        arr[3] = 182_232;
        arr[4] = 133_469;
        arr[5] = 108_864;
        arr[6] = 143_662;
        arr[7] = 110_494;
        arr[8] = 158_550;
        arr[9] = 162_583;
        arr[10] = 152_832;
        arr[11] = 103_797;
        arr[12] = 186_880;
        arr[13] = 127_959;
        arr[14] = 110_952;
        arr[15] = 159_862;
        arr[16] = 168_122;
        arr[17] = 100_462;
        arr[18] = 101_742;
        arr[19] = 168_963;
        arr[20] = 171_581;
        arr[21] = 109_254;
        arr[22] = 148_826;
        arr[23] = 122_437;
        arr[24] = 161_912;
        arr[25] = 122_143;
        arr[26] = 157_728;
        arr[27] = 107_828;
        arr[28] = 184_020;
        arr[29] = 184_711;
        // Задание 1, сумма трат за месяц
        System.out.println("Задание 1");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
         System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Задание 2
        System.out.println("Задание 2");
        int minRashod = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minRashod) {
                minRashod = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minRashod +" рублей");

        int maxRashod = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxRashod) {
                maxRashod = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxRashod +" рублей");

        // Задание 3
        System.out.println("Задание 3");
        int arrSize = arr.length;
        double sredRashod = sum / arrSize;
        System.out.println("Средняя сумма трат за месяц составила " + sredRashod + " рублей");
     //здесь почему-то дробь не считается верно - должно быть 145 791,5(6)

        // Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int a = reverseFullName.length-1; a >= 0; a--) {
            System.out.print(reverseFullName[a]);

        }

    }

    }








