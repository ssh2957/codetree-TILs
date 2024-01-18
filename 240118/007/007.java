import java.util.Scanner;

class Spy{
String a;
String b;
int c;

public Spy(String a,String b,int c ){
    this.a =a;
    this.b= b;
    this.c=c;
}

};







public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a= sc.next();
        String b= sc.next();
        int c= sc.nextInt();

        Spy spy1= new Spy(a,b,c);

         System.out.println("secret code : " + spy1.a);
        System.out.println("meeting point : " + spy1.b);
        System.out.println("time : " + spy1.c);




    }
}