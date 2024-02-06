import java.util.Arrays;
import java.util.Scanner;

class Grade implements Comparable<Grade>{
	 String name;
	int kor, eng, math;
	public Grade(String name, int kor, int eng, int math) {
		this.name= name;
		this.kor = kor;
        this.eng = eng;
        this.math = math;
		
	}
	@Override
	public int compareTo(Grade grade) {
		if(this.kor==grade.kor) {
			if(this.eng==grade.eng) {
				if(this.math==grade.math) {
					//문자 비교하기
					return this.name.compareTo(grade.name);
				}//내림차순
				return grade.math-this.math;
			}//오름차순
			return grade.eng-this.eng;
			}
		return  grade.kor-this.kor;
	
		
	}
	
	
	
	
	
	
}



public class Main {public static void main(String[] args) {
	Scanner sc= new Scanner(System.in); 
		
	int n = sc.nextInt();
	Grade[] arr = new Grade[n];
	for(int i=0; i<n; i++) {
		arr[i]= new Grade(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
	
	}
	Arrays.sort(arr);
	
	 for(int i = 0; i < n; i++)
		 System.out.println(arr[i].name+" "+arr[i].kor + " " + arr[i].eng + " " + arr[i].math);
	
	
	
}

}