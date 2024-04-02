package com.java;

public class MethodOverloading {
	
	//polymorphism means many form
	// ploy means many and morphs means many form
	// Its a concept by which we can perform a single action in different ways.
	
	
	//Run-Time Polymorphism: Whenever an object is bound with the functionality at run time.
	//Compile-time polymorphism: is a polymorphism that is resolved during the compilation process.
	
	//Method Overloading: Multiple methods having same name but different in parameters.
	//it can be achieved by By changing number of arguments and the data type.
	//In java, method overloading is not possible by changing the return type of the method only because of ambiguity
	//we can have any number of main methods in a class by method overloading. But JVM calls main() method which receives string array as arguments only.
	
	//Method Overriding : If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
	//It is because the static method is bound with class whereas instance method is bound with an object.
	//Static belongs to the class area, and an instance belongs to the heap area.
	
	
	public int mark(int T,int E)
	{
		return T+E;
	}
	
	public String mark(int T,int E, String name)
	{
		return name;
		
	}
	
	public static void ap ()
	{
		System.out.println("Aravinth");
	}
	


	

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.mark(7, 8, "Aswin"));
		System.out.println(obj.mark(74, 87));
		
		

	}

}
