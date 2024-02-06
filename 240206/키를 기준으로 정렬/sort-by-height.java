import java.util.Arrays;
import java.util.Scanner;

class Person{
	String name;
	int hight;
	int weight;
	
	public Person(String name,int hight,int weight) {
		this.name=name;
		this.hight= hight;
		this.weight= weight;
		
	}

};




public class Main {public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Person[] arr= new Person[n];
	for(int i=0; i<n;i++) {
		arr[i]= new Person(sc.next(),sc.nextInt(),sc.nextInt());

	}

	Arrays.sort(arr, (a,b)->a.hight-b.hight);

    for(int i = 0; i < 5; i++)
        System.out.println(arr[i].name + " " + arr[i].hight + " " + arr[i].weight);
			
}

}