package miridih;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
	private int number1;
	private int number2;
	private List<Integer>numbers = new ArrayList<Integer>();
	private int count =0;

	public static void main(String[] args) {
		Question1 q1 = new Question1();
		q1.insert();
		q1.find();
	}

	public void insert(){
		Scanner scan = new Scanner(System.in);
		number1 = scan.nextInt();
		number2 = scan.nextInt();
		for(int i=0; i<number1; i++){
			numbers.add(scan.nextInt());
		}
		scan.close();
	}

	public void find(){
		for(int i=0; i<numbers.size()-1;i++){
			for(int j=i+1; j<numbers.size();j++){
				if(Math.abs(numbers.get(i)-numbers.get(j))==number2){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
