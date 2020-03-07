package com.raviteja.collections;
import java.util.*;

public class CustomArrayList {
	
	public Object custom_list[];
	int index = 0;
	
	public CustomArrayList() {
		custom_list=new Object[10];
	}
	
	public Object fetching(int i) {
		if(i <index)
			return custom_list[i];
		else
			throw new ArrayIndexOutOfBoundsException();
	}
	
	public void adding(Object obj) {
		if(custom_list.length-index<=6)
		resize();
		custom_list[index++]=obj;
	}
	
	public int size() {
		return index;
	}
	
	private void resize() {
		custom_list=Arrays.copyOf(custom_list,custom_list.length*2);
	}
	
	public String toString() {
		String string="[";
		for(int i=0;i<index-1;i++)
			string+=custom_list[i]+",";
		string+=custom_list[index-1]+"]";
		return string;
	}
	
	 public Object remove(int i){
	       if(i < index){
	           Object obj = custom_list[i];
	           custom_list[i] = null;
	           int temp = i;
	           while(temp < i){
	        	   custom_list[temp] = custom_list[temp+1];
	        	   custom_list[temp+1] = null;
	               temp++;
	           }
	           index--;
	           return obj;
	       } else {
	           throw new ArrayIndexOutOfBoundsException();
	       }
	 }
	 

}
