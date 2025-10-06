/* Reads an integer n for the array size.
Reads n integers into arr.
Reads an integer l (subarray length).
Then, it tries to find the maximum sum of a subarray of length l by summing up the first n-l+1 elements and updating maxSum.

Input:
6
2 1 5 1 3 4
3

Output:
9
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
        int l = sc.nextInt();
        int maxSum = arr[0],sum=0;
        for(int i=0;i<n-l+1;i++){
            sum+=arr[i];
            maxSum=Math.max(sum,maxSum);
        }
        System.out.println(maxSum);
    }
}
