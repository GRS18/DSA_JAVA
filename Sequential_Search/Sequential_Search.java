package search;

public class Sequential_Search {

	static int serach(int a[], int key) {

		for (int i = 0; i < a.length; i++) {
			
			if (key == a[i]) {
				
				return i;
				
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int a[] = { 77, 11, 22, 33, 99, 44, 88, 55 };

		int key = 44;

		// int r = serach(a, key);

		if (serach(a, key) == -1) { // if (r == -1)
			
			System.out.println(key + " Not Found");
			
		} else {
			
			System.out.println(key + " Found");
			
		}

	}

}
