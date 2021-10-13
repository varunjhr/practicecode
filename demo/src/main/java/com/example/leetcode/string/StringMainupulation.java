package com.example.leetcode.string;

import java.util.Arrays;

public class StringMainupulation {

    public static void main(String[] args) {
        StringMainupulation stringMainupulation = new StringMainupulation();
        System.out.println(stringMainupulation.defangIPaddr("1.1.1.1"));
    }

    public String defangIPaddr(String address) {

        StringBuilder result = new StringBuilder();
        String[] iparray = address.split("\\.");
        for (int i = 0; i < iparray.length - 1; i++) {
            result.append(iparray[i]).append("[.]");
        }
        return result + iparray[iparray.length - 1];
    }
}
