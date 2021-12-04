package SimplePrograms;

public class Student {

	int id = 1000;
	byte age = 18;
	long mobileNo = 91_9876543210L;
	
	float gpa = 3.8f; 
	// while taking decimal values, it consider as double
	// thats why we need to write f or F at end of floating 
	// values. Otherwise error will show.
	// floats has the precision of 7 decimal points
	
	double percentage = 98.56;
	// We don't need to write but we can as 
	// double percentage = 98.56d;
	// double has precision of 15 decimal points
	// double is most prfarable over floats
	
	
	void compute() {
		System.out.println("Id: " + id);
		System.out.println("Age: " + age);
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("GPA: " + gpa);
		System.out.println("Percentage: " + percentage);
	}
	public static void main(String[] args) {
	
		Student s = new Student();
		s.compute();
	}

}
