package com.cyclokitty;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortAndInvert(new int[]{20, 3, 54, 12, -9})));
        System.out.println("*******");
        System.out.println(factorial(10));
        Dinglemouse namer = new Dinglemouse("Yaya", "Cakey Meowy");
        System.out.println(namer.getFullName());
        System.out.println("*******");
        System.out.println(caffeineBuzz(1));
        System.out.println("*******");
        System.out.println(caffeineBuzz(3));
        System.out.println("*******");
        System.out.println(caffeineBuzz(6));
        System.out.println("*******");
        System.out.println(caffeineBuzz(12));
        System.out.println("*******");
        addThree(10);
        System.out.println("*******");
        int total = sum(4, 3, 5, 1);
        System.out.println("The sum is " + total);
        System.out.println("*******");
        int total2 = sum(4, 3, 6, 1);
        System.out.println("The sum is " + total2);
        System.out.println("*******");
        System.out.println(least(10, 5));
        System.out.println("*******");
        System.out.println(least(101, 150));
        System.out.println("*******");
        System.out.println(greatest(21, 35));
        System.out.println("*******");
        System.out.println(greatest(32, 9));
        System.out.println("*******");
        double result = average(10, 20, 30, 40, 50);
        System.out.println("The average of the varargs is " + result);
        System.out.println("*******");
        wordLong("pickles");
        System.out.println("*******");
        System.out.println(whatLetter("ramen", 2));
        System.out.println("*******");
        //userLetters();
        //reverseUser();
        reverseUser("Laura");
        System.out.println("*******");
        partWord("juniper", 2, 5);
        String funny = partWord("baboo",0, 3);
        System.out.println("The funny part of the word \"baboo\" is " + funny);
        int len = "baboo".length();
        String veryFunny = partWord("baboo", 2, len);
        System.out.println("The funny part of the word \"baboo\" is " + veryFunny);

    }


    public static String partWord(String word, int beg, int end) {
        return word.substring(beg, end);
    }

    public static void reverseUser(String name) {
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }
        System.out.println("In reverse order, your name is: " + rev);
    }

    public static void reverseUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type in your name: ");
        String name = scanner.nextLine();
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }
        System.out.println("In reverse order, your name is: " + rev);
    }

    public static void userLetters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        if (name.length() > 2) {
            for (int i = 0; i < name.length(); i ++) {
                System.out.println((i + 1) + ". character: " + name.charAt(i));
                if (i == 2) {
                    break;
                }
            }
        }
        if (name.length() < 3) {
            for (int i = 0; i < name.length(); i++) {
                System.out.println((i + 1) + ". character is " + name.charAt(i));
            }
        }
    }

    public static char whatLetter(String word, int place) {
        char letter = word.charAt(place);
        return letter;
    }

    public static void wordLong(String word) {
        int wordLen = word.length();
        System.out.println("The word " + word + " is " + wordLen + " letters long.");
    }

    public static double average(int ...nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        return (double)total / nums.length;
    }

    public static int greatest(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    public static int least(int num1, int num2) {
        if (num1 > num2) {
            return num2;
        }
        return num1;
    }

    public static int sum(int ...nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        return total;
    }

    // take an array of integers and sort in ascending order and invert the value
    public static int[] sortAndInvert(int[] numList) {
        int temp;
        boolean ordered = true;
        while (ordered) {
            ordered = false;
            for (int i = 0; i < numList.length - 1; i++) {
                if (numList[i] > numList[i + 1]) {
                    temp = numList[i];
                    numList[i] = numList[i + 1];
                    numList[i + 1] = temp;
                    ordered = true;
                }
            }
        }
        for (int i = 0; i < numList.length; i++) {
            numList[i] *= -1;
        }
        return numList;
    }

    // factorial!
    public static int factorial(int n) {
        if (n == 0) {
            throw new IllegalArgumentException("under 0 or over 12");
        }
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        return total;
    }

    public static String caffeineBuzz(int num) {
        if (num % 3 == 0 && num % 4 == 0 && num % 2 == 0) {
            return "CoffeeScript";
        } else if (num % 3 == 0 && num % 4 == 0) {
            return "Coffee";
        }
         if (num % 3 == 0 && num % 2 == 0) {
            return "JavaScript";
        } else if (num % 3 == 0) {
             return "Java";
        }

        return "mocha_missing!";
    }

    public static void addThree(int number) {
        System.out.println("Method param is " + number);
        int total = number + 3;
        System.out.println("The answer is " + total);
    }

}
