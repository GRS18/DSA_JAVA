package sort;

public class Quick_Sort {
	static void print_array(int a[]) {

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}
	}

	void quick_sort(int a[], int start, int end)

	{

		int i = start;

		int j = end;

		int pivot = end;	// int pivot = start

		while (i < j)

		{

			while (a[i] < a[pivot])

				i++;

			while (a[j] > a[pivot])

				j--;

			if (i < j)

			{

				int temp = a[i];

				a[i] = a[j];

				a[j] = temp;

			}

		}

		if (i < end)

			quick_sort(a, i + 1, end);

		if (j > start)

			quick_sort(a, start, j - 1);

	}

	public static void main(String[] args) {

		int a[] = { 77, 11, 22, 33, 99, 44, 88, 55 };

		System.out.println("\nArray has: ");
		print_array(a);

		Quick_Sort que = new Quick_Sort();

		que.quick_sort(a, 0, 7);

		System.out.println("\nSorted Array using Quick Sort : ");
		print_array(a);

	}
}
