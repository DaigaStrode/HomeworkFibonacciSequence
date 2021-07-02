package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter position in fibonacci sequence: ");
        int[] sequence = new int[scanner.nextInt()];

        for (int i = 0; i < sequence.length; i++) {
            if (i==0 || i==1) {
                sequence[i] = i;
            }else
            sequence[i] = sequence[i-1] + sequence[i-2];
        }

//        System.out.println(Arrays.toString(sequence));
        System.out.println("The value in position " + sequence.length + " is: " + sequence[sequence.length-1]);
    }
}
