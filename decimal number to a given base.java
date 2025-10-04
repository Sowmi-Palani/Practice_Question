/* Question: Convert a decimal number to a given base (up to base 36).

Write a program that takes two inputs:
An integer n (decimal number)
An integer divisor (the base to convert to, between 2 and 36)
Your program should convert the decimal number n to the number system with base divisor and print the result.
Digits from 0 to 9 should be represented as 0-9, and digits from 10 onwards should be represented as uppercase letters A-Z (where A corresponds to 10, B to 11, and so on).

Input:
718
12

Output:
4BA
*/


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int divisor = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int rem = n%divisor;
            if(rem>=0 && rem<=9){
                sb.append(rem);
            }
            else{
                sb.append((char) ('A' + (rem - 10)));
            }
            n/=divisor;
        }
        System.out.println(sb.reverse().toString());
    }
}
