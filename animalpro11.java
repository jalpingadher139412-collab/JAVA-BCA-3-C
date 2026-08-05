//unit 2 program 1

class animal{
String name = "animal";
void eat(){
	System.out.println("this animal eats food.");
}
}

//subclass (child) inheriting animal

class dog extends animal {
	void bark() {
		System.out.println("the dog barks: woof! woof!");
	}
}

//main execution class

public class animalpro11 {
	public static void main(String[] args) {
		dog mydog = new dog();
		mydog.eat(); //inherited method from animal class!
		mydog.bark();  //own method of dog class
	}
}