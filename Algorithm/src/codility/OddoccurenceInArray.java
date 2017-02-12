package codility;

public class OddoccurenceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {9,3,9,3,9,7,9};
		OddoccurenceInArray odd = new OddoccurenceInArray();
		odd.solution(A);
	}

	public int solution(int[] A) {
		// write your code in Java SE 8
//		int answer =0;
//		for(int i=0; i<A.length-1; i++){
//			for(int j=i+1; j<A.length;j++){
//				if(A[i]==A[j]){
//					A[i]=0;
//					A[j]=0;
//				}
//			}
//		}
//		for(int a : A){
//			if(a != 0){
//				answer =a;
//				break;
//			}
//		}
//		System.out.println(answer);
//		return answer;
		
		for (int a : A){
			System.out.print(a);
		}
		System.out.println();
		int i;
		int res = 0;
		for (i = 0; i < A.length; i++) 
		{
		res = res ^ A[i]; // Implementation of XOR
		System.out.println(res);
		}
		//System.out.println(res);
		return res;

	}
}
