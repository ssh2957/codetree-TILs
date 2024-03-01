import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int min, T, m, max;
	static int[] arr;
	static int[] arr1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		m = sc.nextInt();
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;

		arr = new int[T];
		arr1 = new int[m - 1];
		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();
		}

		combination(1, 0);
		System.out.println(min);

	}

	private static void combination(int idx, int cnt) {
        if(max>min) {
			return;
		}
		int sum = 0;

		if (cnt == m - 1) {

			for (int i = arr1[cnt - 1] + 1; i < T; i++) {
				sum += arr[i];
			}
			if (sum > max) {
				max = sum;
			}

			if (max < min) {

				min = max;
			}

			return;

		}

		if (idx == T - 1) {
			return;
		}

		// idx뽑았을경우;
		arr1[cnt] = idx;
		// 구간합 구하기
		if (cnt == 0) {
			max = Integer.MIN_VALUE;
			for (int i = 0; i < idx; i++) {
				sum += arr[i];
			}
			if (sum > max) {
				max = sum;
			}

		} else {
			for (int i = arr1[cnt - 1] + 1; i < idx; i++) {
				sum += arr[i];
			}
			if (sum > max) {
				max = sum;
			}

		}
		combination(idx + 1, cnt + 1);
		arr1[cnt] = 0;

		// idx안뽑았을경우
		combination(idx + 1, cnt);

	}

}