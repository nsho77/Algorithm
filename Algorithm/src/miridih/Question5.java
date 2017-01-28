package miridih;

import java.util.Scanner;

public class Question5 {

	private String line; 
	private String[] sline;

	public static void main(String[] args) {

		Question5 q5 = new Question5();

		q5.frame();
	}

	public void frame(){
		Scanner scan = new Scanner(System.in);
		int rotate = scan.nextInt();

		for(int i=0; i<rotate; i++){			
			line = scan.next();
			sline= line.split("");
			make();
		}

		scan.close();
	}

	public void switcher(int i, String[] a){
		String b = a[i];
		a[i] = a[i+1];
		a[i+1] = b;
	}

	public void arrange(String[] a, int num){

		for(int i=num; i<a.length-1;i++){
			if(a[i].compareTo(a[i+1])>0){
				switcher(i,a);
				for(int j=i;j>num;j--){
					if(a[j].compareTo(a[j-1])<0){
						switcher(j-1,a);
					}
				}
			}
		}
	}

	public void make(){
		String [] b = sline;

		for(int i=b.length-2; i>=0; i--){
			int j =i+1;

			if(b[i].compareTo(b[j])>=0 && i!=0){
				continue;
			}else if(b[i].compareTo(b[j])>=0 && i==0){
				System.out.println("no answer");
				return;
			}
			else{
				arrange(b,j);
				switcher(i,b);
				break;
				//arrange b[i]를 제외한 나머지 를 정렬하고 그중 가장 앞에있는 것과 b[i]를 교체한다
				//switcher
			}

		}
		for( String bb: b){
			System.out.print(bb);
		}
		System.out.println();

	}

}
