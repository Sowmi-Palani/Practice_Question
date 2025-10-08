/*This program rewards employees with an incentive based on their performance rating and outputs the updated salary.
Incentive Calculation Logic:
1) If the rating is between 1 and 3 (inclusive) → employee gets 10% of salary as incentive.
2) If the rating is between greater than 3 and up to 4 → employee gets 25% of salary as incentive.
3) If the rating is between greater than 4 and up to 5 → employee gets 30% of salary as incentive.

I/P: 8000
     3
O/P : 8800
*/


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        double rate = sc.nextDouble();
        double in=0;
        if(rate>=1 && rate<=3){
            in=0.1*salary;
        }
        else if(rate>3 && rate<=4){
             in=0.25*salary;
        }
        else if(rate>4 && rate<=5){
              in=0.3*salary;
        }
        double amt = in+salary;
        System.out.println((int)amt);
    }
}
