package miridih;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question4 {
	
	private int money=0;
	private List<Integer> basket = new ArrayList<Integer>();
	private List<Integer> numbers = new ArrayList<Integer>();
	private int day= 1;
	
	public static void main(String[] args) {
		Question4 q4 = new Question4();
		q4.insert();
	}
	
	public void insert(){
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		for(int i=0; i<number1; i++){
			numbers.clear();
			int number2 = scan.nextInt();
			for(int j=0; j<number2; j++){
				int number3 = scan.nextInt();
				numbers.add(number3);
			}
			System.out.println(numbers);
		}			
		scan.close();
	}
	
	public void buy(){
		int price = numbers.get(day-1);
		basket.add(price);
		money = money-price;
		day ++;
	}
	
	public void sell(int stock){
		for(int i=0; i<stock; i++){
			money = money + numbers.get(day-1);
			basket.remove(0);			
		}
	}
	
	public void doNothing(){
	}
	
	public void plan(){
		buy();
		for(int i=1; i<numbers.size(); i++){
						
		}
		
		day=0;
		doNothing();
		for(int i=1; i<numbers.size(); i++){
			
		}
	}
}
