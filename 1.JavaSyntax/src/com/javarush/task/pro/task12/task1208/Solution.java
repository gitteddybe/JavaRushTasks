package com.javarush.task.pro.task12.task1208;

/* 
Сравнение символов
*/

public class Solution {
    public static void main(String[] args) {
        compare('a', 'a');
        //compare('a', 'б');
        //compare('р', 'в');
        //compare('ы', 'ы');
    }

    public static void compare(Character first, Character second) {
        // === variant 1
//        if (first.equals(second)) {
        // === variant 2
        if (first.charValue() == second.charValue()) {
            System.out.println("равны");
        } else if (first > second) {
            System.out.println("больше");
        } else if (first < second) {
            System.out.println("меньше");
        } else {
            System.out.println("А как такое может быть???");
        }
    }
}