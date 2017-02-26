package codility;

public class FrogJmp {
	public static void main(String[] args) {
		FrogJmp frogJmp = new FrogJmp();
		frogJmp.solution(10, 85, 30);
	}
	
	public int solution(int X, int Y, int D){
		int dis = Y-X;
		double whatTime = dis / (double)D;
		int result = (int)Math.ceil(whatTime);
		System.out.println(result);
		return result;
		
	}
}
