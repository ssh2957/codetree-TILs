import java.util.Scanner;

class Bomb{
	String code,color;
	int second;
	
	public Bomb(String code,String color,int second){
		this.code= code;
		this.color=color;
		this.second= second;
		
	
	}

}



public class Main {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Bomb boo= new Bomb(sc.next(),sc.next(),sc.nextInt());
	System.out.println("code : "+boo.code);
	System.out.println("color : "+boo.color);
	System.out.println("second : "+boo.second);
	
}

}