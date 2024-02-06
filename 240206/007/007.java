import java.util.Scanner;

class Spy{
	String secret_code, meeting_point;
	int time;
	
	public Spy(String secret_code, String meeting_point,int time) {
		this.secret_code= secret_code;
		this.meeting_point=meeting_point;
		this.time= time;
	}
	

};




public class Main {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a= sc.next();
	String b= sc.next();
	int c= sc.nextInt();
	Spy spy= new Spy(a,b,c);
	System.out.println("secret code : "+spy.secret_code);
	System.out.println("meeting point : "+spy.meeting_point);
	System.out.println("time : "+spy.time);
	
}

}