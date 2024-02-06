import java.util.Scanner;

class Code{
	String name;
	int code;
	public Code(){
		this.name="codetree";
		this.code=50;
		
		
	}
	
	public Code(String name,int code){
		this.name= name;
		this.code=code;
		
	}
	
	
};



public class Main {public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	Code code1= new Code();
	Code code2= new Code(sc.next(),sc.nextInt());
	
	
	System.out.println("product "+code1.code+" is "+code1.name);
	System.out.println("product "+code2.code+" is "+code2.name);
	
}

}