import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	int k =sc.nextInt();
	char[] a= sc.next().toCharArray();
	
	ArrayList<String> arr = new ArrayList<>();
	
	for(int i =0; i<n; i++) {
		boolean hi =true;
		String b= sc.next();
		char[] c=b.toCharArray();
		for(int j=0; j<a.length; j++) {
			
			if(a[j]!=c[j]) {
				hi= false;
				break;
			}
		}
		if(hi) {
			arr.add(b);
		}
	}
	Collections.sort(arr);
	
	
	System.out.println(arr.get(k-1));
	
	
	
	
}

}