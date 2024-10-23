/*
	* Protected Access Modifier :
	
- When a member is made protected, we can access that member not only within the same class but also in another classes and within the same package as well as in another packages but within the Child classes only.
- As the members of the class are made protected, we can access this members in another package using the concept of inheritence only.
- As the class is made public in following program, we can access it not only in same package as well as in another package.


>> javac -d . CSSkills.java
>> java com.cybersuccess.training.CSSkills

*/

package com.cybersuccess.training;

public class CSSkills{
	protected void testing(){
		System.out.println("Inside testing method.");
	}
	protected void java(){
		System.out.println("Inside java method.");
	}
	protected void python(){
		System.out.println("Inside python method.");
	}
}