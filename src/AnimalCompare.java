import java.util.Comparator;

public class AnimalCompare implements Comparator<Dog> ,  Comparable<Dog>{
	
	public String name;
	public Integer numLegs;

	public int compare(Dog d1, Dog d2){ //Comparator, multiple compares possible
		if (d1.name.equalsIgnoreCase(d2.name)){
			return d1.numLegs.compareTo(d2.numLegs);
		}
		else {
			return d1.name.compareToIgnoreCase(d2.name);
		}
		
	}

	public int compareTo(Dog d){ //Comparable, overriding default compareTo
		if (this.name.equalsIgnoreCase(d.name)){
			return this.numLegs - d.numLegs;
		}
		else {
			return this.name.length() - d.name.length();
		}
	}
}