package com.company;

public class Exercise2 {
    public static void main(String[] args) {
        /*
        Две клетки на шахматной доске определены своими координатами (x1,y1) и (x2,y2).
        1. Может ли конь переместиться с первой на вторую клетку?
        2. Может ли король переместиться с первой на вторую клетку?
        */
        int x1 = 1, y1 = 1, x2 = 2, y2 = 1;
        //exercise 1
        boolean e1 = (Math.abs(x2 - x1) == 1 && Math.abs(y2 - y1) == 2) ||
                     (Math.abs(x2 - x1) == 2 && Math.abs(y2 - y1) == 1);
        System.out.println("Answer 1 : " + e1);
        //exercise 2
        boolean e2 = (Math.abs(x2 - x1) == 1 && Math.abs(y2 - y1) == 1) ||
                     (Math.abs(x2 - x1) == 1 && Math.abs(y2 - y1) == 0) ||
                     (Math.abs(x2 - x1) == 0 && Math.abs(y2 - y1) == 1);
        System.out.println("Answer 2 : " + e2);
    }
}
