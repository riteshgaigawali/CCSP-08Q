package learnjdbc.examples;

import learnjdbc.examples.dao.StudentDao;
import learnjdbc.examples.dao.StudentDaoImpl;
import learnjdbc.examples.entity.Student;

//main class
public class StudentMain {

	public static void main(String[] args) {
		
		StudentDao stdao = new StudentDaoImpl();
		
//		Student stud1 = new Student("Aakash", "Chandrapur", "aakshkadukar@gmail.com", 22);
//		Student stud2 = new Student("Sumit", "Kolhapur", "sumitdhadam@gmail.com", 22);
//		Student stud3 = new Student("Anuj", "Nashik", "anujmahajain@gmail.com", 22);
//		Student stud4 = new Student("Jamir", "Kolhapur", "jamirbagwan@gmail.com", 22);
//		stdao.createStudent(stud1);
//		stdao.createStudent(stud2);
//		stdao.createStudent(stud3);
//		stdao.createStudent(stud4);
//		stdao.updateStudent(102);
//		stdao.deleteStudent(105);
		stdao.readStudents();
		

	}

}
