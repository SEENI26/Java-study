package org.sample;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Colle {
	
	public static void main(String[] args) {
		
		List<Integer> l =new LinkedList<>();
		
		l.add(10);
		l.add(40);
		l.add(89);
		l.add(100);
		
		System.out.println(l);
		
		int i = l.size();
		System.out.println("Size :"+ i);
		
		Integer va = l.get(1);
		System.out.println("Value :"+ va);
		
		l.add(2, 90);
		System.out.println(l);
		
		l.set(3, 75);
		System.out.println(l);
		
		l.remove(3);
		System.out.println("Last remove list :" + l);
		
		boolean b = l.contains(40);
		System.out.println(b);
		
		boolean c = l.isEmpty();
		System.out.println(c);
		
		int first = l.indexOf(10);
		System.out.println("First 10 present:" + first);
		
		int last = l.lastIndexOf(100);
		System.out.println("last 100 present:"+ last);
		
		List<Integer> list2 =new Vector<>();
		
		list2.add(35);
		list2.add(45);
		
		list2.addAll(l);
		System.out.println("list2 add: "+ list2);
		
		//list2.retainAll(l);
		//System.out.println("comman values :" + list2);
		
		list2.removeAll(l);
		System.out.println("After removing comman values :" + list2);
	}

}
