import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Comparisons {

	public static void main(String[] args) {
		ArrayList<Wombat> herd = new ArrayList<Wombat>();
		Wombat w1 = new Wombat(1);
		Wombat w2 = new Wombat(2);
		Wombat w3 = new Wombat(3);
		Wombat w4 = new Wombat(4);
		Wombat w5 = new Wombat(5);
		Wombat w6 = new Wombat(6);
		
		herd.add(w1);
		herd.add(w2);
		herd.add(w3);
		herd.add(w4);
		herd.add(w5);
		herd.add(w6);
		
		
		WombatLegsCompare wlc = new WombatLegsCompare();
		Collections.sort(herd, new WombatLegsCompare());
		
		for (Wombat w: herd) {
			System.out.print(w.numLegs);
		}
	}
}
