/*Implement a hash table using linear probing with a table size of 10 and a hash function of x % 10 for indexing.
The hash table should efficiently store and retrieve key-value pairs.
@GRS
*/
package hashTable;

public class HashTable {

	private int size = 10;
	private int[] keys;
	private String[] values;

	public HashTable() {
		keys = new int[size];
		values = new String[size];
	}

	private int hash(int key) {
		return key % size;
	}

	public void insert(int key, String value) {
		int index = hash(key);

		while (keys[index] != 0) {
			if (keys[index] == (key)) {
				values[index] = value;
				return;
			}
			index = (index + 1) % size;
		}

		keys[index] = key;
		values[index] = value;
	}

	public String get(int key) {
		int index = hash(key);

		while (keys[index] != 0) {
			if (keys[index] == (key)) {
				return values[index];
			}
			index = (index + 1) % size;
		}

		return "Not Found in HashTable";
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			if (keys[i] != 0) {
				System.out.print("(" + keys[i] + ", " + values[i] + ")  ");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		HashTable HashTable = new HashTable();

		HashTable.insert(1, "one");
		HashTable.insert(2, "two");
		HashTable.insert(12, "twelve");
		HashTable.insert(3, "three");
		HashTable.insert(3, "three");

		System.out.println(HashTable.get(1));
		System.out.println(HashTable.get(2));
		System.out.println(HashTable.get(12));
		System.out.println(HashTable.get(3));
		System.out.println(HashTable.get(4));
		System.out.println(HashTable.get(3));
		System.out.println(HashTable);
	}
	
}
