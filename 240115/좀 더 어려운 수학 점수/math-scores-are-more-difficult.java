import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int math_a = sc.nextInt();
        int eg_a = sc.nextInt();
        int math_b = sc.nextInt();
        int eg_b  = sc.nextInt();

         if(math_a > math_b || (math_a == math_b && eg_a > eg_b))
            System.out.println("A");
        else
            System.out.println("B");
    }

    }
}