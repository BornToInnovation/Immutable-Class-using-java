package com.borntoinnovation.java.example;

// Declare class and data member as final
final class Test{
	final int id;
	final String name;
	
	Test(int id, String name){
		this.id = id;
		this.name = name;
	}

	// No setter method
	public int getId() {
		return id;
	}

		public String getName() {
		return name;
	}
	
}

public class ImmutableEx {

	public static void main(String[] args) {
		Test test = new Test(11, "Test11");
		System.out.println(test.getId()+","+test.getName());

		// here, I am creating new object by using new keyword.
		test = new Test(22,"Test22");
		System.out.println(test.getId()+","+test.getName());

	}

}
