import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        double c = b/((a*0.01)*(a*0.01));
        System.out.println((int) c);
        if(c>=25)System.out.print("Obesity");


    }
}