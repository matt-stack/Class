import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Dog extends Animal{
	
	public String name;
	public Integer numLegs;
	
	public Dog (String name, Integer numLegs) {
		this.name = name;
		this.numLegs = numLegs;
	}
	
	public String toString(){
		return this.name;
	}
	
	
	public static void main(String[] args){
		ArrayList<Dog> pack = new ArrayList<Dog>();
		Dog spotFourLegs = new Dog("Spot", 4);
		Dog spotOlThreeLegs = new Dog("Spot", 3);
		Dog fido = new Dog("Fido", 2);
		pack.add(spotFourLegs);
		pack.add(spotOlThreeLegs);
		pack.add(fido);

		System.out.print(pack);

		AnimalCompare animalComp = new AnimalCompare();
		Collections.sort(pack, animalComp); //Comparator
		
		System.out.print(pack);

		Collections.sort(pack); //Comparable
		
		System.out.print(pack);
	}

}