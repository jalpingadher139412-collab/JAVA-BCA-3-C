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

class cat extends animal {
	void mieww() {
		System.out.println("the cat mieww: mieww! mieww!");
	}
}

//main execution class

public class program13 {
	public static void main(String[] args) {
		dog mydog = new dog();
		mydog.eat();	//inherited method from animal class!
		mydog.bark();  //own method of dog class
		
		cat mycat = new cat();
		mycat.eat();
        mycat.mieww();
	}
}