package pkg_learn_java;

public class Demo {

	//Constructor Overloading
	//Default Constructor
	public Demo() {
		System.out.println("Constructor 1");
	}
	
	//Parameterized Constructor
	public Demo(int i) {
		System.out.println("Constructor 2");
		System.out.println(i);
	}
	
	//Parameterized Constructor
	public Demo(int i, float f) {
		System.out.println("Constructor 3");
		System.out.println(i);
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		Demo obj_demo = new Demo();
		Demo obj_Demo1 = new Demo(1);
		Demo obj_Demo2 = new Demo(1,1.1f);

	}

}


//Constructor - Instance of the class itself
/* 1. Member Method
 * 2. Same name as the class name
 * 3. It will never return anything
 * 4. It will be used to allocate memory
 * 5. Constructors cannot be called explicitly
 * 6. If we write a parameterized constructor we also need to have one default constructor
 */