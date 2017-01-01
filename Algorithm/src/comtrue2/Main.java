package comtrue2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Main {

	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	String[] byone = a.split("");
	String[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");		
	String[] number = "0123456789".split("");
	Map<String, Integer> alphanum = new HashMap<String, Integer>();
	List<String> meaning = new ArrayList<String>();


	public Map<String, Integer> getAlphanum(){
		int i = 10;
		for(String alpha: alphabet){
			alphanum.put(alpha, i);
			i++;
		}
		return alphanum;
	}

	public List<String> getMeaning(){
		for(String s : byone){
			if(Arrays.asList(alphabet).contains(s)){
				meaning.add(s);
			}else if(Arrays.asList(number).contains(s)){
				meaning.add(s);
			}
		}
		return meaning;
	}

	public List<Integer> getCal(){		
		List<Integer> cal = new ArrayList<Integer>();
		this.meaning = getMeaning();
		this.alphanum = getAlphanum();

		for(int s=0;s<meaning.size();s++){			

			if(Arrays.asList(alphabet).contains(meaning.get(s))){
				cal.add(alphanum.get(meaning.get(s)));
			}else if(Arrays.asList(number).contains(meaning.get(s))){
				cal.add(Integer.parseInt(meaning.get(s)));
			}

		}

		return cal;
	}

	public boolean getResult(List<Integer> cal){
		if(cal.get(4) == ( 0 * 2 + cal.get(0) * 3 + cal.get(1) * 5 + cal.get(2) * 7 + cal.get(3) * 11 ) % 36){
			return true;
		}else{
			return false;
		}
	}

	public boolean second(List<Integer> cal){
		int[] aa = {4,9,14,19};
		List<String> b = new ArrayList<String>();
		for (int a : aa){
			if(cal.get(a+5) == ( cal.get(a) * 2 + cal.get(a+1) * 3 + cal.get(a+2) * 5 + cal.get(a+3) * 7 + cal.get(a+4) * 11 ) % 36){
				b.add("T");
			}else {
				b.add("F");
			}
		}

		if(!b.contains("F")){

			return true;
		}else{
			return false;
		}
	}
	public void getResult2(){
		List<Integer> cal = getCal();

		List<String> result = new ArrayList<String>();
		for(int i=0; i<cal.size()-24; i++){
			List<Integer> cal2 = cal.subList(i, i+25);
			if(getResult(cal2) && second(cal2)){
				for(int j=i; j<i+25; j++){

					result.add(meaning.get(j));
				}
			}
		}
		for(int i=0; i*25<result.size()-24;i++){
			List<String> subResult = result.subList(i*25, i*25+25);

			for(int j=0; j<subResult.size(); j++){
				
				if(j%5 == 0 && j!=0){
					System.out.print("-");
				}
				System.out.print(subResult.get(j));
			}
			if(i*25<result.size()-25){
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		Main a = new Main();
		a.getResult2();
	}
}
