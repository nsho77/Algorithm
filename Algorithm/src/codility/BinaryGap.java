package codility;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
	private List<Integer> binaryArray = new ArrayList<Integer>();

	public static void main(String[] args) {
		BinaryGap binarygap = new BinaryGap();
		binarygap.solution(1024);

	}

	public int solution(int n){
		
		int num1 = n;
		int reminder= num1;
		while(num1 >= 1 ){
			
			reminder = num1%2;
			binaryArray.add(0, reminder);
			num1 = num1 / 2;
			
		}
		System.out.print(binaryArray.toString());
		System.out.println();
		
		int count1 =0;
		int count2 =0;
		for(int i=0; i<binaryArray.size(); i++){
						
			if(binaryArray.get(i) != 0){
				if(count2>count1){
					count1 = count2;
				}
				count2 =0;
			}else{
				count2 ++;
			}
		}

		System.out.println(count1);
		return count1;
	}
}
