
public class Etc {

	public static void main(String[] args) {
		final int LENGTH = 12;
		final int NUMS_PER_ROW = 3;
		
		int[] arr = new int[LENGTH];
		
		int i = 4;
		for (int x = 0; x < LENGTH; x++) {
			arr[x] = x * i;
		}
		
		int l = 0;
		for(int y = 0; y < LENGTH; y++) {
			if (l == NUMS_PER_ROW - 1) {
				System.out.println(arr[y]);
				l = 0;
			}
			else {
				System.out.print(arr[y]);
				l++;
			}
		}
	}

}
