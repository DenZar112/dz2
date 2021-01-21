package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	/*Задача 1:Задать целочисленный массив, состоящий из элементов 0 и 1.
	           Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
	           С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
        System.out.println("Задание 1: ");
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив:\n" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }

        }
        System.out.println("получим массив: \n" + Arrays.toString(arr));

    /*Задача 2:Задать пустой целочисленный массив размером 8.
               С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/
        int [] mas = new int[8];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i * 3;
        }
        System.out.println("Задание 2: \n" + Arrays.toString(mas));

    /*Задача 3:Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
               пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
        int arr3 [] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание 3:");
        System.out.println("Исходный массив: \n" + Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i] < 6){

               arr3[i] = arr3[i] * 2;
            }

        }
        System.out.println("Получим массив: \n" + Arrays.toString(arr3));

    /*Задание 4:Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
                и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/

        System.out.println("Задание 4: ");
        int [][] arr4 = new int[4][4];
        for (int i = 0; i < arr4.length; i++) {
            System.out.println();
            for (int j = 0; j < arr4[i].length; j++) {
                if(i==j){
                    arr4[i][j] = 1;
                }else if(i == 0 & j == arr4.length-1 || i == arr4.length-1 & j == 0){
                    arr4[i][j] = 1;
                } else if(i == 1 & j == arr4.length-2 || i == arr4.length-2 & j == 1) {
                    arr4[i][j] = 1;
                }else{
                    arr4[i][j] = 0;
                }

                System.out.print(arr4[i][j]  + " ");
            }

        }

    /*Задание 5:Задать одномерный массив и найти в нем
                минимальный и максимальный элементы (без помощи интернета);*/

        int[]arr5 = {23,45,607,89,96};
        System.out.println();
        System.out.println("Задание 5: ");
        System.out.println("Исходный массив: \n" + Arrays.toString(arr5));
        int max = arr5[0];
        int min = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if(max < arr5[i]){
                max = arr5[i];
            }else if(min >arr5[i]){
                min = arr5[i];
            }
        }
        System.out.println("максимальное число массива: " + max);
        System.out.println("минимальное число массива: " + min);

    /*Задание 6:** Написать метод, в который передается не пустой одномерный целочисленный массив,
                метод должен вернуть true, если в массиве есть место,
                в котором сумма левой и правой части массива равны.
                Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
                checkBalance([1, 1, 1, || 2, 1]) → true,
                граница показана символами ||, эти символы в массив не входят.*/

        System.out.println("Задание 6: ");

        int [] arr6 = {2, 2, 2, 1, 2, 2, 10, 1};

        System.out.println("[" + arr6[0] + ", " + arr6[1] + ", " + arr6[2] + ", " +
                arr6[3] + ", " + arr6[4] + ", " + arr6[5] + ", " + "|| " + arr6[6] + ", " +
                arr6[7] + "]" + "\n(где знак '||' - граница левой и правой части массива)");

        halfMassive(arr6);

    /*Задача 7:Написать метод, которому на вход подается одномерный массив и
               число n (может быть положительным, или отрицательным), при этом метод должен сместить
               все элементы массива на n позиций. Элементы смещаются циклично.
               Для усложнения задачи нельзя пользоваться вспомогательными массивами.
               Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
                        [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
                        При каком n в какую сторону сдвиг можете выбирать сами.*/

        System.out.println("Задача 7: ");
        int [] arr7 = {3,5,6,1};
        int n = -2;
        System.out.println("Исходный массив: " + Arrays.toString(arr7) + "\nпри n = " + n +
                "\n(Если n > 0 - сдвиг вправо, если n < 0 - сдвиг влево)");
        driftMassive(arr7,n);

    }

    public static boolean halfMassive(int [] a){ //Задание 6
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < a.length-2; i++) {
            sum1 += a[i];
        }

        for (int j = 6; j < a.length; j++) {
            sum2 += a[j];
        }
        System.out.println("сумма левой части массива равна: " + sum1);
        System.out.println("сумма правой части массива равна: " + sum2);
        boolean c1 = true;
        boolean c2 = false;

        if(sum1 == sum2){
            System.out.println("ответ: True");
            return c1;

        }else{
            System.out.println("ответ: False");
            return c2;
        }

    }

    public static int[] driftMassive(int[] a, int n){ //Задание 7

        if (n>0 && n < a.length && n != 0) {
            for (int i = 0; i < n; i++) {
                int x = a[0];
                a[0] = a[a.length - 1];

                for (int j = 1; j < a.length - 1; j++) {
                    a[a.length - j] = a[a.length - j - 1];
                }
                a[1] = x;
            }
            System.out.println("Получим массив с учетом сдвига: " + Arrays.toString(a));

        }
        else if (n < 0 && Math.abs(n)< a.length && n != 0){
            for (int i = 0; i > n; i--) {
                int x = a[a.length -1];
                a[a.length - 1] = a[0];

                for (int j = 1; j < a.length-1; j++) {
                    a[j-1] = a[j];
                }
                a[a.length-2] = x;
            }
            System.out.println("Получим массив с учетом сдвига: " + Arrays.toString(a));
        }else{
            System.out.println("значение 'n' должно быть меньше длины массива и не равно 0");
        }
            return a;
    }


}



