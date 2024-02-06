import java.util.Arrays;
import java.util.Scanner;

public class Main {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T =sc.nextInt();
	int[] arr1= new int[T];
	int[] arr2= new int[T];
	
	
	for(int i =0; i<T; i++) {
		arr1[i]= sc.nextInt();

	}
	Arrays.sort(arr1);
	for(int i =0; i<T; i++) {
		arr2[i]= sc.nextInt();

	}
	Arrays.sort(arr2);
	

	boolean s= true;
	for(int i =0; i<T; i++) {
		if(arr1[i]!=arr2[i]) {
			s=false;
			break;
		}

	}
	
	if(s==true) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
	
	
}

}