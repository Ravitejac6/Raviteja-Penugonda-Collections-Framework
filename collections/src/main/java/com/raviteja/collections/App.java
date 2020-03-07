package com.raviteja.collections;
import java.util.*;

public class App{
	
    public static void main( String[] args ){	
    	Scanner scan = new Scanner(System.in);
    	CustomArrayList custom_list =new CustomArrayList();
    	System.out.println("Intializing the list with 10 Integers");
    	custom_list.adding(new Integer(1));
    	custom_list.adding(new Integer(2));
    	custom_list.adding(new Integer(3));
    	custom_list.adding(new Integer(4));
    	custom_list.adding(new Integer(5));
    	custom_list.adding(new Integer(6));
    	custom_list.adding(new Integer(7));
    	custom_list.adding(new Integer(8));
    	custom_list.adding(new Integer(9));
    	custom_list.adding(new Integer(10));
    	System.out.print("After adding the elements : ");
        System.out.println(custom_list);
        System.out.println("Enter how many elements you want to remove:");
        int remove_elements  = scan.nextInt();
    	for(int i = 0; i < remove_elements; i++) {
    		System.out.println("Enter the index you want to remove:");
    		int n = scan.nextInt();
    		custom_list.remove(n);
    	}
    	System.out.println(" Elements in the list after removing:");
    	System.out.println(custom_list);
    	
    	System.out.println("Enter how many elements you want to fetch:");
    	int fetch_elements  =scan.nextInt();
    	for(int i = 0; i < fetch_elements; i++) {
    		System.out.println("Enter the elemen you want to fetch: ");
    		int n = scan.nextInt();
    		custom_list.fetching(n);
    	}  	
    	
    	System.out.print("All Elements in list after fetching ");
        System.out.println(custom_list);
    	System.out.println("Fectching");
    	
       System.out.print("All Elements in list are ");
       System.out.println(custom_list);
       System.out.println("Number of elements in list are:"+custom_list.size());
    }
}
