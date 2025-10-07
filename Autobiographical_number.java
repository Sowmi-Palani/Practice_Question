// reads a single string input (expected to be a numeric string) and checks if the string represents a 
// self-describing number under certain constraints. If the string meets all the criteria, it outputs 
// the number of unique digits in the string; otherwise, it outputs -1.




import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length()>10){
            System.out.println("-1");
            return;
        }
        int num = Integer.parseInt(str);
        int sum =0;
        while(num>0){
            int ld = num%10;
            sum+=ld;
            num/=10;
        }
        if(str.length()!=sum){
            System.out.println("-1");
            return;
        }
        Set<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()){
            set.add(ch);
        }
        String s="";
        for(int i=0;i<str.length();i++){
            int count=0;
            char d = (char)('0'+i);
            for(char ch : str.toCharArray()){
                if(ch==d){
                    count++;
                }
            }
            s+=count;
        }
        if(s.equals(str)){
            System.out.println(set.size());
        }
        else{
            System.out.println("-1");
        }
    }
}
