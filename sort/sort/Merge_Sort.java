package sort;

public class Merge_Sort {

	static void merger(int a[], int start, int mid, int end) {
		int i, j, temp[], tindex;
		i = start;
		j = mid + 1;
		// temp array to keep sorted data
		temp = new int[a.length];
		tindex = start;
		// compare and copy in order
		while (i <= mid && j <= end) {
			if (a[i] < a[j])
				temp[tindex++] = a[i++];
			else
				temp[tindex++] = a[j++];
		}
		// copy leftover
		while (i <= mid)
			temp[tindex++] = a[i++];
		while (j <= end)
			temp[tindex++] = a[j++];

		// copy back to a from temp
		for (i = start; i <= end; i++)
			a[i] = temp[i];
	}

	static void merge_sort(int a[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			merge_sort(a, start, mid);
			merge_sort(a, mid + 1, end);
			merger(a, start, mid, end);
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

		merge_sort(a, 0, a.length - 1);
		System.out.println("\nSorted Array using Merge Sort : ");
		print_array(a);

	}

}
