package Code;

import java.util.Scanner;

public class Day_6_LetsReview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0){
            String str= sc.nextLine();
            int n= str.length();
            String even = "";
            String odd="";

            for(int i=0;i<n;i++){
                if(i==0 || i%2==0){
                    even+=String.valueOf(str.charAt(i));
                }else{
                    odd+=String.valueOf(str.charAt(i));
                }
            }
            System.out.println(even+" "+odd);
        }
    }
}
