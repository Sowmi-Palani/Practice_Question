/*Step-by-step:
Input Reading:
The program first reads an integer n, which represents the number of integers to process.
It then reads n integers into the array arr.

Sum of Digits Calculation:
For each integer in arr, the program calculates the sum of its digits.
For example, if the number is 123, the sum of digits is 1 + 2 + 3 = 6.
These sums are stored in the array sarr.

Classification by Odd and Even Sums:
The program separates the sums of digits into two lists:
oddlist contains sums that are odd numbers.
evenlist contains sums that are even numbers.

Output Odd and Even Sums:
It prints all the odd sums under the label "Odd nums:".
Then prints all the even sums under the label "Even nums:".

Find Minimum Odd Sum and Maximum Even Sum:
Among the odd sums, the program finds the minimum value (oddmin).
Among the even sums, it finds the maximum value (evenmax).
These values are printed.

Final Result Calculation:
The program calculates the sum (res) of the original integers (arr[i]) whose digit sums are either equal to the minimum odd sum (oddmin) or the maximum even sum (evenmax).
Finally, it prints this result.

i/p:
6
55 87 46 21 34 79
o/p:
Odd nums:
15 3 7 
Even nums:
10 10 16 
Odd min:3 Even max:16
100
*/


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i=0;i<9;i++){
            arr[i]=sc.nextInt();
        }
        int[] score = new int[3];
        int a=0, max=Integer.MIN_VALUE;
        for(int i=0;i<3;i++){
            int sum =arr[i]+arr[i+3]+arr[i+6];
            double avg = sum/3;
            score[i]=(int)avg;
        }
        for(int s:score){
            max=Math.max(max,s);
        }
        for(int i=0;i<score.length;i++){
            System.out.print(score[i]+" ");
        }
        for(int i=0;i<score.length;i++){
            if(score[i]==max){
                System.out.print("\nPlayer"+(i+1)+" ");
            }
        }
    }
}
