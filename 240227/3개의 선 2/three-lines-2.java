import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] sel;
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		int[] count = new int[11];// 어떤숫자가 있나 확인할 count 배열
		ArrayList<Integer> arr1 = new ArrayList<>();

		// 배열 가져오기
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();

			count[arr[i][0]]++;
			count[arr[i][1]]++;

		}

		for (int i = 0; i < 11; i++) {
			if (count[i] > 0) {
				arr1.add(i);

			}
		}

		sel = new boolean[n];

		boolean ans = false;
		hi: for (int i = 0; i < arr1.size() - 2; i++) {
			for (int j = i; j < arr1.size() - 1; j++) {
				for (int k = j; k < arr1.size(); k++) {

					int cnt = 0;
					for (int l = 0; l < n; l++) {
						if (arr[l][0] == i || arr[l][0] == j || arr[l][0] == k || arr[l][1] == i || arr[l][1] == j
								|| arr[l][1] == k) {
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

		if (ans) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}