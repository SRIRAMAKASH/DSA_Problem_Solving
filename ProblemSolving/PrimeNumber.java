/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.Scanner;

/**
 *
 * @author SRIRAM AKASH
 */
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the Number to Check Whether is prime or not and Give 0 For Exist :");
            Long num = sc.nextLong();

            if (isPrime(num)) {
                System.out.println("The Given Number is " + num + " Prime");
            } else {
                System.out.println("The Given Number is " + num + " Not Prime");
            }
            if(num == 0)
            {
                break;
            }

        }

    }

    public static boolean isPrime(Long num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }

}
