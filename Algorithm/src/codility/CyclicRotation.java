package codility;

import java.util.ArrayList;
import java.util.List;

public class CyclicRotation {
	private List<Integer> aArray = new ArrayList<Integer>();
	private int box1;
	private int box2;
	private int[] result;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CyclicRotation cyclicRotation = new CyclicRotation();
		int[] A =  {3, 8, 9, 7, 6};
		cyclicRotation.solution( A, 2);
	}

	public int[] solution(int[] A, int K){

		for(int a : A){
			aArray.add(a);
		}
		for(int i=0; i<K;i++){
			swiswitch();
		}
		
		System.out.println(aArray.toString());
		result = new int[aArray.size()];
		for(int j=0; j<result.length;j++){
			result[j]=aArray.get(j);
		}
		return result;
	}

	public void swiswitch(){

		for(int index=0; index<aArray.size()-1;index++){
			if(index ==0){
				box1 = aArray.get(index+1);
				aArray.remove(index+1);
				aArray.add(index+1, aArray.get(index));
			}else{
				box2= aArray.get(index+1);
				aArray.remove(index+1);
				aArray.add(index+1, box1);
				box1 = box2;
			}

			if(index==aArray.size()-2){
				aArray.remove(0);
				aArray.add(0, box1);
			}
		}
	}

}
