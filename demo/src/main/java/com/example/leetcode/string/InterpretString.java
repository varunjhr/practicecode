package com.example.leetcode.string;

public class InterpretString {

    public static void main(String[] args) {
        InterpretString interpretString = new InterpretString();
        System.out.println(interpretString.interpret("(al)G(al)()()G"));
    }

    public String interpret(String command) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if ("G".equalsIgnoreCase(String.valueOf(command.charAt(i)))) {
                result.append(command.charAt(i));
            }
            if ("(".equalsIgnoreCase(String.valueOf(command.charAt(i))) &&
                    i < command.length() - 1 &&
                    ")".equalsIgnoreCase(String.valueOf(command.charAt(i + 1)))) {
                result.append("o");
            }
            if ("(".equalsIgnoreCase(String.valueOf(command.charAt(i))) &&
                    i < command.length() - 1 &&
                    "a".equalsIgnoreCase(String.valueOf(command.charAt(i + 1)))) {
                result.append("al");
            }

        }
        return result.toString();
    }
}
