package com.vidya.dynamicpgm;

import java.time.LocalDateTime;

public class FibonacciNumbers {

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(fibonacci(20));
        System.out.println(LocalDateTime.now());
        System.out.println("----------------");
        System.out.println(LocalDateTime.now());
        System.out.println(fibonacciOptimized(20));
        System.out.println(LocalDateTime.now());
    }

    static int fibonacci(int i){
        if(i ==0 || i == 1)
        {
            return i;
        }
        return fibonacci(i-1) + fibonacci(i-2);
    }

    static int fibonacciOptimized(int i){
        return fibonacciOptimized(i, new int[i+1]);
    }

    static int fibonacciOptimized(int i, int[] memo){
        if(i == 0 || i == 1){
           return i;
        }

        if(memo[i]==0){
            memo[i] = fibonacciOptimized(i-1,memo) + fibonacciOptimized(i-2,memo);
        }

        return memo[i];
    }
}
