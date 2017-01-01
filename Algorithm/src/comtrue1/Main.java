package comtrue1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		List<String> kim = new ArrayList<String>();
		List<String> paks = new ArrayList<String>();
		List<String> noduplicates = new ArrayList<String>();
		String[] names = sentence.split(",");
		int i = 0;
		int j = 0;
		for(String name : names){
			if(name.substring(0).contains("김")){
				kim.add(name);
			}else if(name.substring(0).contains("박")){
				paks.add(name);
			}
			if(j == 0){
				noduplicates.add(name);
				j++;
			}else{
				if(!noduplicates.contains(name)){
					noduplicates.add(name);
				}
			}
		}
		for(String pak: paks){
			if(pak.equals("박민")){
				i++;
			}
		}
		
		
		System.out.println(kim.size());
		System.out.println(paks.size());
		System.out.println(i);
		for(int k=0; k<noduplicates.size();k++){
			if(k!=noduplicates.size()-1){
				System.out.print(noduplicates.get(k)+",");
			}else {
				System.out.println(noduplicates.get(k));
			}
		}
		
		Collections.sort(noduplicates);
		for(int k=0; k<noduplicates.size();k++){
			if(k!=noduplicates.size()-1){
				System.out.print(noduplicates.get(k)+",");
			}else {
				System.out.println(noduplicates.get(k));
			}
		}
		Collections.reverse(noduplicates);
		for(int k=0; k<noduplicates.size();k++){
			if(k!=noduplicates.size()-1){
				System.out.print(noduplicates.get(k)+",");
			}else {
				System.out.println(noduplicates.get(k));
			}
		}
	}
}
