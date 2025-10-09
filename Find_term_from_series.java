/*Find the 15th term from the series
   0,0,7,6,14,12,21,18,28,24,35,30,42,36,49,....
Odd term increased by 7
Even term increased by 6

i/p:
18
15
o/p:
0 0 7 6 14 12 21 18 28 24 35 30 42 36 49 42 56 48 
49
*/

  
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nthTerm = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[nthTerm];
        arr[0]=0;arr[1]=0;
        for(int i=2;i<nthTerm;i++){
            if(i%2==0){
                arr[i]=arr[i-2]+7;
            }
            else{
                arr[i]=arr[i-2]+6;
            }
        }
        for(int i=0;i<nthTerm;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n"+arr[k-1]);
    }
}
