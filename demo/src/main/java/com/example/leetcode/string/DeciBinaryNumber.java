package com.example.leetcode.string;

public class DeciBinaryNumber {
    public static void main(String[] args) {
        DeciBinaryNumber deciBinaryNumber = new DeciBinaryNumber();
        System.out.println(deciBinaryNumber.minPartitions("27346209830709182346"));
    }

    public int minPartitions(String n) {
        int j = 0;
        int k = 0;
        int number1;
        int number2 = 0;
        if (n.length() <= 1) {
            return Integer.parseInt(n);
        }
        for (int i = 0; i < n.length() + 1; i++) {
            number1 = Integer.parseInt(String.valueOf(n.charAt(j)));
            number2 = Integer.parseInt(String.valueOf(n.charAt(k + 1)));
            if (number2 > number1 && i > 1) {
                j = i - 1;
                k = i>=n.length()?i:i-1;
            }
            if (number2 <= number1) {
               k = i>=n.length()?i:i-1;
                number2 = number1;
            }

        }
        return number2;
    }
}
