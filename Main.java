package com.company;

public class Main {

    static int Fibonacci(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        else{
            return (Fibonacci(n-1) + Fibonacci(n-2));
        }
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(Fibonacci(6));
    }
}
