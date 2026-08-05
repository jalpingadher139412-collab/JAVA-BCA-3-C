//unit 2 program 2

class animal{
String name = "animal";
void eat(){
	System.out.println("this animal eats food.");
}
}

//subclass (child) inheriting animal

class puppy extends dog {
	void weep() {
		System.out.println("puppy is weeping.");
	}
}

public class multilevelpro12 {
public static void main(String[] args) {
puppy p = new puppy();
p.eat();
p.bark();
p.weep();
}
}
	