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
		int answer =0;
		for(int i=0; i<A.length-1; i++){
			for(int j=i+1; j<A.length;j++){
				if(A[i]==A[j]){
					A[i]=0;
					A[j]=0;
				}
			}
		}
		for(int a : A){
			if(a != 0){
				answer =a;
			}
		}
		System.out.println(answer);
		return answer;
	}
}
