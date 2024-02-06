import java.util.Scanner;

class Per{
	String id="codetree";
	int level=10;
	
	public Per(String id,int level){
		this.id=id;
		this.level=level;

	}
	
	public Per(){
		this.id="codetree";
		this.level=10;

	}

};


public class Main {public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	Per per1= new Per();
	
	String a= sc.next();
	int b =sc.nextInt();
	Per per2 = new Per(a,b);
	System.out.println("user "+per1.id+" lv "+per1.level);
	System.out.println("user "+per2.id+" lv "+per2.level);
	
	
	
	
	
}

}