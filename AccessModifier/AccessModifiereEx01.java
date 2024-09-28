/*
- An example to demostrate packages and how do we import files from one package to another.
- While crating a domain we always use the reverse eof the domain.
Ex: www.infosys.com --> package com.infosys, www.hsbc.infosys.com --> com.infosys.hsbc
- We can use 'import' keyword to import files from one package to another.
- The package delcaration/creation statement will always be the first statement in a Java program.

	* Access Modifiers :

- There are four types of access modifiers in Java :
1) public
2) protected
3) default
4) private

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