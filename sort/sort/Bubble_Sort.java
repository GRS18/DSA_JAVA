package sort;

public class Bubble_Sort {

	static void bubble_sort(int a[]) {
		int i, j, temp;
		for (i = 0; i < a.length - 1; i++)// given n-1 passes
		{
			for (j = 0; j < a.length - 1; j++)// compare and swap if needed
			{
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	static void print_array(int a[]) {

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}
	}

	public static void main(String[] args) {

		int a[] = { 77, 11, 22, 33, 99, 44, 88, 55 };

		System.out.println("\nArray has: ");
		print_array(a);

		bubble_sort(a);
		System.out.println("\nSorted Array using Bubble Sort : ");
		print_array(a);

	}

}
