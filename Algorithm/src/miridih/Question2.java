package miridih;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question2 {
	private int number1;
	private int number0;
	private List<Integer> numberList = new ArrayList<Integer>();
	private List<String> result = new ArrayList<String>();
	
	public static void main(String[] args) {
		Question2 q2 = new Question2();
		q2.frame();
	}
	
	public void frame(){
		Scanner scan = new Scanner(System.in);
		number1 = scan.nextInt();
		for(int i=0;i<number1;i++){
			number0 = scan.nextInt();
			for(int j=0; j<number0; j++){
				numberList.add(scan.nextInt());
			}
			result.add(find());
			numberList.clear();
			System.out.println("findmethod is called");
		}
		scan.close();
		System.out.println("method is called");
		for(String s : result){
			System.out.println(s);
		}
	}
	
	public String find(){
		for(int i=0; i<numberList.size(); i++){
			int leftSum=0;
			int rightSum=0;
			for(int j=i-1;j>=0;j--){
				leftSum+=numberList.get(j);
			}
			for(int k=i+1;k<numberList.size();k++){
				rightSum += numberList.get(k);
			}
			if(leftSum == rightSum){
				return "Yes";
			}
		}
		return "No";
	}
}
