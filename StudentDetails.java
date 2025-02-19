package Demo;

import java.util.Vector;

//Student class to store details
class StudentDetailsClass {
private int id;
private String name;
private int age;

// Constructor
public StudentDetailsClass(int id, String name, int age) {
   this.id = id;
   this.name = name;
   this.age = age;
}

// Method to display student details
public void display() {
   System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
}
}


public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a Vector to store student objects
	     Vector<StudentDetailsClass> studentList = new Vector<>();

	     // Adding students to the Vector
	     studentList.add(new StudentDetailsClass(101, "Alice", 20));
	     studentList.add(new StudentDetailsClass(102, "Bob", 21));
	     studentList.add(new StudentDetailsClass(103, "Charlie", 22));

	     // Displaying student details
	     System.out.println("Student Details:");
	     for (StudentDetailsClass student : studentList) {
	         student.display();
	     }
		
	}

}


//output
/* Student Details:
ID: 101, Name: Alice, Age: 20
ID: 102, Name: Bob, Age: 21
ID: 103, Name: Charlie, Age: 22
*/



