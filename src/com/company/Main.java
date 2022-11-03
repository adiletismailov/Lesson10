package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(work(5, 124, 578, 546, 47, 99, 436, 7, 5));
    }

    public static boolean work(int a, int... b) {
        for (int num : b) {
            if (a == num) {
                return true;
            }
        }
        return false;
    }
}
