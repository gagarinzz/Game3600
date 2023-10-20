package com.example.a3606;

public class Logic {

    public static int l;
    //public static int strValue;
    public static String strValue;
    public static int k=7;
    public static int x;
    public static int y;

    public static void main(String[] args) {
        int[][] array2 = {
                {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 20},
                {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 20},
                {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 20},
                {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 20},
        };
        int[] nominalValues = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 20};

        int columnSum = 0;
        for (int t = 0; t < 3; t++) {
            columnSum += array2[t][y];}
            int nominalValue = nominalValues[y];
            if (columnSum < nominalValue * 3) {
             System.out.println("Column " + (y + 1) + " меньше тройного значения.");
             k = 0;
            }else {
             k=1;
        }
        //int k=8;
        //int l = (MainActivity.array[1]+2);
        //String strValue = new String();
        //strValue = Integer.toString(k);
      
        //for (int j = 0; j < 13; j++) {
            //int columnSum = 0;
            //for (int i = 0; i < 3; i++) {
                //columnSum += array2[i][j];
           // }
           // int nominalValue = nominalValues[j];
            //if (columnSum < nominalValue * 3) {
               // System.out.println("Column " + (j + 1) + " меньше тройного значения.");
               // k = 0;break;
            //}else {
               // k=1;
            //}
       // }
        // Проверка 2: Число столбцов с суммой больше нуля должно быть 12
        int countColumnsWithPositiveSum = 0;

        for (int j = 0; j < 13; j++) {
            //int columnSum = 0;
            for (int i = 0; i < 4; i++) {
                columnSum += array2[i][j];
            }
            if (columnSum > 0) {
                countColumnsWithPositiveSum++;
            }
        }
        if (countColumnsWithPositiveSum < 13 ) {
            System.out.println("число столбцов с позитивной суммой меньше 12.");
        }
        // Проверка 3: Сумма соседних столбцов должна быть втрое больше номинального значения
        for (int j = 1; j < 12; j++) {
            int currentColumnSum = 0;

            int nextColumnSum = 0;
            int backColumnSum = 0;
            for (int i = 0; i < array2.length; i++) {
                currentColumnSum += array2[i][j];
                nextColumnSum += array2[i][j + 1];
                backColumnSum += array2[i][j-1];
            }
            int nominalValue1 = nominalValues[y];
            int nominalValue2 = nominalValues[y+1];
            int nominalValue3 = nominalValues[y-1];

            if (currentColumnSum < 3 * nominalValue1 || nextColumnSum < 3 * nominalValue2 || backColumnSum < 3 * nominalValue3) {
                System.out.println("Сумма соседних колонок "+ (j) +"," + (j+1) + " and " + (j + 2) + " меньше тройного значения.");
            }
        }
        // Проверка 4: Число нолей в каждой строке меньше 2
        for (int i = 0; i < 4; i++) {
            int zeroCount = 0;
            for (int j = 0; j < 13; j++) {
                if (array2[i][j] == 0) {
                    zeroCount++;
                    if (zeroCount >= 2) {
                        System.out.println("Строка " + (i+1) + " содержит 2 или более нулей.");
                    }
                }
            }
        }
    }
}

