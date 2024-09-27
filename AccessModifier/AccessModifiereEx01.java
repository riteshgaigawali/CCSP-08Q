/*
- An example to demostrate packages and how do we import files from one package to another.
- We can use 'import' keyword to import files from one package to another.
- The package delcaration/creation statement will always be the first statement in a Java program.

- The members of com.cybersuccess.training.CSSkills class are protected, hence to access those members we need to extend the class.

>> javac -d . PakcagesEx05.java
>> java com.capgemini.hr.PackagesEx05

*/
package com.capgemini.hr;

import com.cybersuccess.training.CSSkills;

class CapgeminiHiring extends CSSkills{
	static void checkSkills(){
		CapgeminiHiring ch = new CapgeminiHiring();
		
		ch.testing();
		ch.java();
		ch.python();
	}
}
class AccessModifiereEx01{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		CapgeminiHiring.checkSkills();
		
		System.out.println("Stop @Cyber Success");
	}
}