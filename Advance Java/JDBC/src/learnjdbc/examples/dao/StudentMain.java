package learnjdbc.examples.dao;

import learnjdbc.examples.entity.Student;

//main class
public class StudentMain {

	public static void main(String[] args) {
		
		StudentDao stdao = new StudentDaoImpl();
		
		Student stud = new Student("Aakash", "Chandrapur", "aakshkadukar@gmail.com", 22);
		stdao.createStudent(stud);
		stdao.updateStudent(102);
		stdao.deleteStudent(105);
		stdao.readStudents();
		

	}

}
