package sort;

public class Insertion_Sort {

	static void insertion_sort(int a[]) {
		int i, j, new_element;
		for (i = 0; i < a.length - 1; i++)// given n-1 passes
		{
			new_element = a[i + 1];// ref
			j = i + 1;// unsorted starts from
			while (j > 0 && new_element < a[j - 1]) {
				a[j] = a[j - 1];// pullback
				j--;
			}
			a[j] = new_element;
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

		insertion_sort(a);
		System.out.println("\nSorted Array using Insertion Sort : ");
		print_array(a);

	}

}
