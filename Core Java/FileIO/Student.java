/*
- Example to demonstrate the process of Serialization and Deserialization.

- To make objects of the class serializable it is neccessary to implement the Serializable interface by the entity class. 

*/


import java.io.Serializable;

//Here Student is the entity class.
class Student implements Serializable{
	
	int studId;
	String studName;
	
	Student(int studId, String studName){
		this.studId = studId;
		this.studName = studName;
	}
	
}