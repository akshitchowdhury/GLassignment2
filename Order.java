package com.assignmentQ1;

import java.util.ArrayList;

public class Order {
	public static void constructionOrder(int max, ArrayList<Integer> arr) {
        int day =1, reqFloorSize;
        reqFloorSize = max;
        while(day<=max){
            System.out.println("Day: "+day);
            while(arr.subList(0,day).contains(reqFloorSize)){
                System.out.print(reqFloorSize-- +" " );
            }
            System.out.println("");
            day++;
        }
    }
}
