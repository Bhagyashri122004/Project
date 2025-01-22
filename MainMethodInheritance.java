package Demo;

//Parent class
class Person {
//Attributes
String name;
int age;

//Constructor
public Person(String name, int age) {
 this.name = name;
 this.age = age;
}

//Method
public void speak() {
 System.out.println(name + " says: Hello!");
}
}

//Child class
class Student extends Person {
//Additional attribute
String grade;

//Constructor
public Student(String name, int age, String grade) {
 // Call parent class constructor
 super(name, age);
 this.grade = grade;
}

//Additional method
public void study() {
 System.out.println(name + " is studying in grade " + grade + ".");
}
}

public class MainMethodInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Student object
	      Student student = new Student("Pari", 25, "A");

	      // Call the methods
	      student.speak();
	      student.study();

		}
}


/* Pari says: Hello!
Pari is studying in grade A.
*/







