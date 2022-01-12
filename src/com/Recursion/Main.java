package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// factorial of a number:
        System.out.println(fact(6));
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
