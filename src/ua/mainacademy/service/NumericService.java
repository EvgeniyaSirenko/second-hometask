package ua.mainacademy.service;

public class NumericService {
    public static int getSumByTypes(int number) {
        int result = 0;
        String str = Integer.toString(number);
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            result = result + Character.getNumericValue(ch[i]);
        }

        return result;
    }

    public static int getSumByMath(int number) {
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number = number / 10;
        }

        return result;
    }
}
