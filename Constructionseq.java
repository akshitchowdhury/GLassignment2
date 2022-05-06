package com.assignmentQ1;

import java.util.ArrayList;
import java.util.Scanner;

public class Constructionseq {
	
	Order order = new Order();

	 public static void main(String[] args) {
	        int numofFloors, day = 1,floorSize;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Please enter the numner of Floors");
	        numofFloors = sc.nextInt();
	        ArrayList<Integer> arr = new ArrayList<>();
	        while (day <= numofFloors) {
	            System.out.println("enter the floor size given on day :" + day);
	            floorSize =sc.nextInt();
	            if(floorSize<=numofFloors && !arr.contains(floorSize)){
	                arr.add(floorSize);
	            }
	            else{
	                System.out.println("Input is Invalid");
	                break;
	            }
	            day++;
	        }
	        //End of Input//
	        if(arr.size()==numofFloors) {
	            System.out.println("The order of construction is as follows");
	            Order.constructionOrder(numofFloors, arr);
	        }
	    }
	 
	 
	 
		

}
