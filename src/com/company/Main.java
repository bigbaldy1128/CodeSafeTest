package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            int a = 6 / 0;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
