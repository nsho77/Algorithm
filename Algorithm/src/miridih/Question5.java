package miridih;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question5 {
	
	private String line;
	private String[] sline;

	public static void main(String[] args) {
		
		Question5 q5 = new Question5();
		//q5.frame();
		q5.arrange();
	}
	
	public void frame(){
		Scanner scan = new Scanner(System.in);
		int rotate = scan.nextInt();
		
		for(int i=0; i<rotate; i++){			
			line = scan.next();
			sline= line.split("");
		}
		
		scan.close();
	}
	
	public void arrange(){
		String [] a = {"a","s","f"};
		for(int i=0; i<a.length-1;i++){
			if(a[i].compareTo(a[i+1])>0){
				String b = a[i];
				a[i] = a[i+1];
				a[i+1] = b;
			}
		}		
	}
	
	public void make(){
		String [] a = {"z","y","y","x","w","w","t","r","r","n","m","l","g","g","f","e","b"};
		List<String> b = new ArrayList<String>();
		List<String> c = new ArrayList<String>();
		for(String str : a){
			b.add(str);
		}
//		if(b.get(b.size()-1).compareTo( b.get(b.size()-2)) >0 ){
//			//switch
//			//return
//		}
		for(int i=b.size()-2; i>0; i--){
			for(int j=i+1; j<b.size();j++){
				if(b.get(i).compareTo(b.get(j))>=0){
					
				}
			}
		}
			
	}

}
//154433 끝 두 자리를 정렬한다 본래 수보다 크면 그게 답 아니면 한 자리 더 본다
//정렬을 한다 정렬을 할 때 먼저 새로운 숫자를 다른 곳에 넣는 정렬을 한다
//없으면 한 자리 더 본다 없으므로 한 자리 더 본다
//없으므로 한 자리 더 본다
//있으므로 가장 작은 3과 바꾸고 3을 제외한 수들 중 가장 작은 값으로 정렬시킨다