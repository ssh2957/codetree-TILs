import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] sel;
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		int[] countx = new int[11];// 어떤숫자가 있나 확인할 count 배열
		int[] county = new int[11];
		ArrayList<Integer> arrx = new ArrayList<>();
		ArrayList<Integer> arry = new ArrayList<>();
		// 배열 가져오기
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();

			countx[arr[i][0]]++;
			county[arr[i][1]]++;

		}

		for (int i = 0; i < 11; i++) {
			if (countx[i] > 0) {
				arrx.add(i);

			}
		}
		
		for (int i = 0; i < 11; i++) {
			if (county[i] > 0) {
				arry.add(i);

			}
		}
		
		int s= arrx.size()+arry.size();

		

		boolean ans = false;
		hi: for (int i = 0; i < s - 2; i++) {
			for (int j = i; j < s - 1; j++) {
				for (int k = j; k < s; k++) {

					sel = new boolean[n];
					int cnt = 0;
					// 모두 세로줄
					if(i>=arrx.size()) {
						int a =i-arrx.size();
						int b =j-arrx.size();
						int c =k-arrx.size();
						for (int l = 0; l < n; l++) {
							if (arr[l][1] == arry.get(a) || arr[l][1] == arry.get(b)
									|| arr[l][1] == arry.get(c)) {
								sel[l] = true;

							}

						}
						for (int l = 0; l < n; l++) {
							if (sel[l]) {
								cnt++;
							}

						}
						if (cnt == n) {
							ans = true;
							break hi;
						}
						
						
						
						
						
						
						
					}
					//j,k만 세로줄
					else if(j>=arrx.size()) {
						int a =i;
						int b =j-arrx.size();
						int c =k-arrx.size();
						
						for (int l = 0; l < n; l++) {
							if (arr[l][0] == arrx.get(a) || arr[l][1] == arry.get(b)
									|| arr[l][1] == arry.get(c)) {
								sel[l] = true;

							}

						}
						for (int l = 0; l < n; l++) {
							if (sel[l]) {
								cnt++;
							}

						}
						if (cnt == n) {
							ans = true;
							break hi;
						}
						
					}
					//k만 세로줄
					else if(k>=arrx.size()) {
						int a =i;
						int b =j;
						int c =k-arrx.size();
						for (int l = 0; l < n; l++) {
							if (arr[l][0] == arrx.get(a) || arr[l][0] == arrx.get(b)
									|| arr[l][1] == arry.get(c)) {
								sel[l] = true;

							}

						}
						for (int l = 0; l < n; l++) {
							if (sel[l]) {
								cnt++;
							}

						}
						if (cnt == n) {
							ans = true;
							break hi;
						}
						
					}
					// 다 가로줄
					else {
						int a =i;
						int b =j;
						int c =k;
						for (int l = 0; l < n; l++) {
							if (arr[l][0] == arrx.get(a) || arr[l][0] == arrx.get(b)
									|| arr[l][0] == arrx.get(c)) {
								sel[l] = true;

							}

						}
						for (int l = 0; l < n; l++) {
							if (sel[l]) {
								cnt++;
							}

						}
						if (cnt == n) {
							ans = true;
							break hi;
						}
						
						
					}
					

				}
			}
		}

		if (ans) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}