/*Find the count of different bits between two numbers.

Input:
5
9
Output:
3

Input:
18
9
Output:
4
*/


import java.util.*;
class Main {
    public static String binary(int num){
        StringBuilder str = new StringBuilder();
        while(num>0){
            int rem = num%2;
            str.append(rem);
            num/=2;
        }
        return str.reverse().toString();
    }
    public static String length(String str,int maxL){
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<maxL-str.length();i++) {
            sb.append('0');
        }
        sb.append(str);
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String str1 = binary(n1);
        String str2 = binary(n2);
        int maxL = Math.max(str1.length(), str2.length());
        str1 = length(str1,maxL);
        str2 = length(str2,maxL);
        int cnt = 0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

--------------------------------------------------------------------------------------(Alter)
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String binary1=Integer.toBinaryString(a);
        String binary2=Integer.toBinaryString(b);
        int c=0;
        int maxLen=Math.max(binary1.length(),binary2.length());
        while(binary1.length()<maxLen){
            binary1="0"+binary1;
        }
        while(binary2.length()<maxLen){
            binary2="0"+binary2;
        }
        for(int i=0;i<binary1.length();i++){
            if(binary1.charAt(i)!=binary2.charAt(i)){
                c++;
            }
        }
        System.out.println(c);
    }
}
