package arrays_Problems;

public class FindFirstDuplicateElement {

	public static void main(String[] args) {
		int[] array = { 3, 4, 6, 7, 2, 7, 1, 3 };
		boolean[] visited = new boolean[array.length];

		for (int i = 0; i < array.length; i++) {
			if (visited[array[i]]) {
				System.out.println("First duplicate element: " + array[i]);
				break;
			}
			visited[array[i]] = true;
		}
	}

}
