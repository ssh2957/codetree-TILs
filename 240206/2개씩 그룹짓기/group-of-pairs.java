import java.util.Arrays;
import java.util.Scanner;

public class Main { public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int t = sc.nextInt();
	int[] arr = new int[2*t];
	for(int i =0; i<2*t; i++) {
		arr[i]=sc.nextInt();

	}
	
	Arrays.sort(arr);
	int max=-1;
	
	for(int i =0; i<t; i++) {
		if(arr[i]+arr[t*2-i-1]>max) {
			max=arr[i]+arr[t*2-i-1];
		}

	}
	
	System.out.println(max);
	
	
}

}