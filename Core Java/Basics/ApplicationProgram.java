class Teachable{
int stuID;
String stuName;
static String instituteName = "Cyber Success";
void  setStuInfo(int stuID, String stuName){
this.stuID = stuID;
this.stuName = stuName;
}
void getStuInfo(){
System.out.println("Student ID :- "+ stuID+" Name :- "+stuName+" Institute :- "+instituteName);
}
static void reqruitmentSession(){
System.out.println("This is common for all.");
}
}
class ApplicationProgram{
public static void main(String args[]){
Teachable student1 = new Teachable();
student1.setStuInfo(1,"Ritesh");
student1.getStuInfo();
student1.reqruitmentSession();

Teachable student2 = new Teachable();
student2.setStuInfo(2,"Harshal");
student2.getStuInfo();
student2.reqruitmentSession();


}
}