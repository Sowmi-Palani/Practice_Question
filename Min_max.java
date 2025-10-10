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
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] sarr = new int[n];
        for(int i=0;i<n;i++){
            int num = arr[i];
            int sum = 0;
            while(num>0){
                int rem =num%10;
                sum+=rem;
                num/=10;
            }
            sarr[i]=sum;
        }
        List<Integer> oddlist = new ArrayList<>();
        List<Integer> evenlist = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(sarr[i]%2!=0){
                oddlist.add(sarr[i]);
            }else{
                evenlist.add(sarr[i]);
            }
        }
        System.out.println("Odd nums:");
        for(int num:oddlist){
            System.out.print(num+" ");
        }
        System.out.println("\nEven nums:");
        for(int num:evenlist){
            System.out.print(num+" ");
        }
        int oddmin=Integer.MAX_VALUE, evenmax=Integer.MIN_VALUE;
        for(int num:oddlist){
            oddmin=Math.min(oddmin,num);
        }
        for(int num:evenlist){
            evenmax=Math.max(evenmax,num);
        }
        System.out.print("\nOdd min:"+oddmin+" Even max:"+evenmax+"\n");
        int res = 0;
        for(int i=0;i<n;i++){
            if(sarr[i]==oddmin || sarr[i]==evenmax){
                res+=arr[i];
            }
        }
        System.out.println(res);
    }
}
