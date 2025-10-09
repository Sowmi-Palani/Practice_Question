/*Ques:
   Input 1 should be lesser than the input 2,Both the inputs should be positive.
   Range must always be greater than 0.
   If any of the condition mentioned above fails, then display "Provide valid input".
Use a minimum of one for loop and one while loop.

i/p: 2  15
o/p: 2 3 5 7 11 13
  */

import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();
       if(n1>n2){
           System.out.println("Provide valid input");
           return;
       }
       for(int i=n1;i<=n2;i++){
           boolean prime = true;
           int k=2;
           while(k*k<=i){
               if(i%k==0){
                   prime=false;
                   break;
               }
               k++;
           }
           if(prime){
               System.out.print(i+" ");
           }
       }
    }
}

