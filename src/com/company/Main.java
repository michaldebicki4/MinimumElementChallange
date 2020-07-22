package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	int[] tab = readIntegers(7);
        System.out.println(findMin(tab));
    }
    private static int[] readIntegers(int count){
        int[] tab = new int[count];
        for (int i = 0; i < tab.length; i++){
            tab[i] = scanner.nextInt();
        }
        return tab;
    }
    private static int findMin(int[] tab){
        int number = tab[0];
        for(int i = 0; i < tab.length-1; i++){
            if (tab[i] > tab[i+1] &&  tab[i] > number){
                number = tab[i+1];
            }
        }
        return number;
    }
}
