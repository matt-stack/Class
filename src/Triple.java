import java.util.Iterator;

public class Triple {

	public int[] arr = {1, 2, 3};
	
	public Triple() {
	}
	
	public class MyIterator implements Iterator{
		int count = -1;
		
		public boolean hasNext() {
			return true;
		}
		
		public Object next() {
			count++;
			count = count % 3;
			return arr[count];
		}
	}
	
	public Iterator iterator() {
		MyIterator it = new MyIterator();
		return it;
	}
	
	public static void main(String[] args) {
		
		Triple t = new Triple();
		Iterator ti = t.iterator();
		
		for (int i = 0; i < 10; i++) {
			if ( ti.hasNext()) {
				System.out.print(ti.next() + " ");
			}
			System.out.println();
		}//prints 1 2 3 1 2 3 1 2 3 1

	}

}
