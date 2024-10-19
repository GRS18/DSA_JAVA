package sort;

public class Selection_Sort {

	static void selection_sort(int a[]) {
		int i, j, min, pos;
		for (i = 0; i < a.length - 1; i++)// given n-1 passes
		{
			min = a[i];// ref
			pos = i;// ref
			for (j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					pos = j;
					min = a[j];
				}
			}
			// swap
			a[pos] = a[i];
			a[i] = min;
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

		selection_sort(a);
		System.out.println("\nSorted Array using Selection Sort : ");
		print_array(a);

	}
	
	

}
