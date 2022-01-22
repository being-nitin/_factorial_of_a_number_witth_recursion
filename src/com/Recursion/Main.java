package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// factorial of a number:
        int n =8;
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n==1) {
            return 1;
        }
        else {
            return (n * fact(n - 1));
        }
    }
}
//