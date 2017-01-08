package finda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Jsonparser {
	private String sample = "[{name: \"Douglas Crawford\", salary:80000, address: {line1: \"c/o Unstructured Programmers Anonymous\", line2: \"7723 Western Avenue\", city: \"San Francisco\", state: \"CA\", zip: \"9123\"}}]";
	
	private String sample3 = "[{name: \"Douglas Crawford\", salary:80000, address: {line1: \"c/o Unstructured Programmers Anonymous\", line2: \"7723 Western Avenue\", city: \"San Francisco\", state: \"CA\", zip: \"9123\"}},"
			+ "{name: \"Douglas Crawford\", salary:80000, address: {line1: \"c/o Unstructured Programmers Anonymous\", line2: \"7723 Western Avenue\", city: \"San Francisco\", state: \"CA\", zip: \"9123\"}},"
			+ "{name: \"Brian Kernighan\", salary:60000, address: {line1: \"PO BOX 455\", city:\"Princeton\", state:\"NJ\", zip: \"08544\"}}]";
	
	private String sample2 = "[{name: \"Douglas Crawford\", salary:80000, address: {line1: \"c/o Unstructured Programmers Anonymous\", line2: \"7723 Western Avenue\", city: \"San Francisco\", state: \"CA\", zip: \"9123\"}},"
			+ "{name: \"Brian Kernighan\", salary:60000, address: {line1: \"PO BOX 455\", city:\"Princeton\", state:\"NJ\", zip: \"08544\"}}]";

	private String [] first = sample3.split("[}],");
	private String [] first2;	
	private List<String[]> second = new ArrayList<String[]>();
	private List<Map<String,String>> hello = new ArrayList<Map<String,String>>();

	public static void main(String[] args) {
		Jsonparser a = new Jsonparser();		
		a.result();
		a.print();
	}	

	public void result(){
		for(String a : first){
			first2 = a.split(",", 3);
			second.add(first2);
		}
		for(int n=0;n<second.size();n++){
			Map<String,String> mapinserted = new HashMap<String,String>();
			for(String f : second.get(n)){
				if(f.contains("name")){
					mapinserted.put("name", f.split(":")[1]);
					hello.add(mapinserted);
				}else if(f.contains("salary")){
					mapinserted.put("salary", f.split(":")[1]);
				}else if(f.contains("address")){
					mapinserted.put("address", f.split(":",2)[1]);
				}		
			}
		}
	}
	
	public void print(){
		for(int i=0; i<hello.size(); i++){
			String name = hello.get(i).get("name");
			int salary = Integer.parseInt(hello.get(i).get("salary"));
			String address = hello.get(i).get("address");
			if(address.substring(address.length()-2, address.length()).contains("}]")){
				address = address.substring(0, address.length()-2);
			}
			System.out.print("name:"+name+", ");
			System.out.print("salary: " + salary+", ");
			System.out.println("address: " + address);
		}
	}
}
