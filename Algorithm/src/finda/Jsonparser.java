package finda;

import java.util.HashMap;
import java.util.Map;

public class Jsonparser {
	String sample = "[{name: 'Douglas Crawford', salary:80000, address: {line1: 'c/o Unstructured Programmers Anonymous', line2: '7723 Western Avenue', city: 'San Francisco', state: 'CA', zip: '9123'}},"
			+ "{name: 'Brian Kernighan', salary:60000, address: {line1: 'PO BOX 455', city:'Princeton', state:'NJ', zip: '08544'}}]";

	String sample2 = "[{name: \"Douglas Crawford\", salary:80000, address: {line1: \"c/o Unstructured Programmers Anonymous\", line2: \"7723 Western Avenue\", city: \"San Francisco\", state: \"CA\", zip: \"9123\"}},"
			+ "{name: \"Brian Kernighan\", salary:60000, address: {line1: \"PO BOX 455\", city:\"Princeton\", state:\"NJ\", zip: \"08544\"}}]";

	String [] first = sample2.split(",");
	Map<String , String> map1 = new HashMap<String,String>();

	public static void main(String[] args) {
		Jsonparser a = new Jsonparser();
		String[] first = a.first;
//		for(String b : first){
//			System.out.println(b);
//		}
	}
	
	public void mapping(){
		for(String f : first){
			String [] second = f.split(":");
		}
	}
}
