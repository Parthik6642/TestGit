package webdriver.day11;

import java.util.ArrayList;

public class CompareList {
	
	public static void main(String[] args) {
		
		ArrayList expectedList=new ArrayList();
		expectedList.add("10");
		expectedList.add("20");
		expectedList.add("30");
		expectedList.add("40");
		

		ArrayList actualList=new ArrayList();
		actualList.add("10");
		actualList.add("20");
		actualList.add("30");
		actualList.add("50");
		
		System.out.println(expectedList.equals(actualList));
	}

}
