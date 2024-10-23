package learnjdbc.examples.dao;

import learnjdbc.examples.entity.Student;

//data access object
public interface StudentDao {

	public void createStudent(Student stud);
	public void readStudents();
	public void updateStudent(int studId);
	public void deleteStudent(int studId);
	
}
