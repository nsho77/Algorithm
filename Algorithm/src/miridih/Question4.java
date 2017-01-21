package miridih;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question4 {
	
	private int money=0;
	private List<Integer> basket = new ArrayList<Integer>();
	private List<Integer> numbers = new ArrayList<Integer>();

	
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
			findLargest();
			money=0;
		}			
		scan.close();
	}
	
	public void buy(int day){
		int price = numbers.get(day);
		basket.add(price);
		money = money-price;
	}
	
	public void sell(int day){
		//System.out.println(basket.size());
		for(int i=0; i<basket.size(); i++){
			money = money + numbers.get(day);	
		}
		basket.clear();
	}
	
	public void doNothing(){
	}
	
	public void findLargest(){
		int largest = 0;
		int compareInd = 0;
		while(largest<=numbers.size()-1){
			int start = largest;
			for(int i=largest; i<numbers.size()-1; i++){
				compareInd= i+1;
				if(numbers.get(compareInd)>numbers.get(largest)){
					largest = compareInd;
				}
			}
			//System.out.println(largest);
			for(int j =start; j<largest; j++){
				buy(j);
			}
			sell(largest);
			largest = largest + 1;
		}
		System.out.println(money);
	}
	
}
