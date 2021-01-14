package Code;

import java.util.HashMap;
import java.util.Scanner;

public class Day_8_DictionariesAnsMaps {
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            String name = sc.next();
            int phone = sc.nextInt();
            map.put(name,phone);
        }

        while(sc.hasNext()){
            String entry = sc.next();
            if(map.containsKey(entry)){
                int num = map.get(entry);
                System.out.println(entry+"="+num);
            }else{
                System.out.println("Not found");
            }
        }
    }
}
