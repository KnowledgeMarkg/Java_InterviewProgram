package com.Kodnest.A4.July;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapIntro_Hackerrank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>(n);
        for (int i=0; i<n ;i++){
            String name = sc.nextLine();
            int num = sc.nextInt();
            sc.nextLine();
            map.put(name, num);
        }
        while (sc.hasNext()){
            String query = sc.nextLine();
            if(map.containsKey(query)){
                System.out.println(query + "=" + map.get(query));
            }else {
                System.out.println("Not found");
            }
        }
        sc.close();
    }
}
