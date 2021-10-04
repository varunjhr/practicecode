package com.example.common;

public class FibnocciSeries {

    public static void main(String[] args) {
        FibnocciSeries fibnocciSeries = new FibnocciSeries();
        fibnocciSeries.fibnocci(5);
    }

    void fibnocci(int count) {
        int first = 0;
        int second = 1;
        int sum;
        for (int i = 0; i < count; i++) {
            sum = first + second;
            System.out.print(" " + first);
            first = second;
            second = sum;
        }
    }

}
