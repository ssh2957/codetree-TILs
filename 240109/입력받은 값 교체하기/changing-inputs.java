import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temt = b;
        b = a;
        a = temt;
        System.out.print(a + " "+ b);
    }
}