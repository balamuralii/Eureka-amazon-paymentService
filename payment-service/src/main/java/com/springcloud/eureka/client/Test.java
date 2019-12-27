package com.springcloud.eureka.client;

import java.util.ArrayList;
import java.util.Comparator;

public class Test implements Comparator{

	//public static final String POST_URL = "http://dummy.restapiexample.com/api/v1/create";


    public static void main(String[] args) throws Exception {
    	
	ArrayList<Book> bookArrList = new ArrayList<Book>();
	
	bookArrList.add(new Book("bala","1"));
	bookArrList.add(new Book("kit","2"));
	bookArrList.add(new Book("vin","3"));
	bookArrList.add(new Book("kal","4"));
	bookArrList.add(new Book("gan","5"));
	bookArrList.add(new Book("gan","6"));
	bookArrList.add(new Book("gan","7"));
	bookArrList.add(new Book("gan","8"));
	bookArrList.add(new Book("gan","9"));
	System.out.println("added 10");
	
	System.out.println("added 11");
	
	System.out.println("added 20");
	System.out.println("added 21 ");
	
	
	
	
    }
    
    
    
   

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		String str = "bala";
		String str2 = new String("bablue");
		
		
		 System.out.println(str.equals(str2.equals("hi")));
		return 0;
	}
}
