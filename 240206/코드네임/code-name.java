import java.util.Arrays;
import java.util.Scanner;

class Spy{
	String code;
	int grade;

	public Spy() {
		
	}
	
	Spy(String code,int grade){
		this.code=code;
		this.grade=grade;
		
	}
	
}

public class Main {public static void main(String[] args) {
	

	Scanner sc= new Scanner(System.in);
	
	Spy[] arr =new Spy[5];
	
	for(int i=0; i<5;i++) {
		arr[i]= new Spy(sc.next(),sc.nextInt());

	}
	int min=110;
	int minvalue=0;
	for(int i=0; i<5;i++) {
		if(arr[i].grade<min) {
			min=arr[i].grade;
			minvalue=i;
		}

	}
	System.out.println(arr[minvalue].code+" "+arr[minvalue].grade);
	
	
	
}
}