import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
            System.out.println(pivo(n));
    }


    public static int pivo(int idx){
            if(idx==1){
                return 1;
            }

            if(idx==2){
                return 1;
            }

            return pivo(idx-1)+pivo(idx-2);



    }

}