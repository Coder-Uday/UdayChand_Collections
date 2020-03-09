package com.epam.Collections;

import java.util.Scanner;


public class Main {
	
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		arrayList<Object> list=new arrayList<Object>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add("hello");
		list.add("world!!");
		
		list.remove(3);
	
		System.out.println("Element at Index 8 : "+list.get(8));
	
		System.out.println("Size of the List : "+list.size());
	
		list.print();
	}
}
