import java.util.Arrays;
import java.util.Scanner;

public class Main { public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char[] a= sc.next().toCharArray();
	Arrays.sort(a);
	char[] b= sc.next().toCharArray();
	Arrays.sort(b);
	boolean c= true;
	
	if(a.length!=b.length) {
		System.out.println("No");
	}
	else {
	for(int i=0; i<a.length;i++) {
		if(a[i]!=b[i]) {
			c=false;
			break;
		}
	}
	if(c) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
	
}
}
}