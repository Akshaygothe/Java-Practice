package SimplePrograms;

public class Student {

	int id = 1000; // [-2147483648 to 2147483647]
	byte age = 18; // [-128 to 127]
	short rank = 165; // [-32,768 to 32,767]
	long mobileNo = 91_9876543210L; // [-9,223,372,036,854,775,808 (-263) to 9,223,372,036,854,775,807 (263 – 1)]
	
	// Integer Literals: int literal, Long literal
	
	byte minValue = Byte.MIN_VALUE;
	byte maxValue = Byte.MAX_VALUE;
	
	void compute() {
		System.out.println("Id: " + id);
		System.out.println("Age: " + age);
		System.out.println("Rank: " + rank);
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("minValue: " + minValue);
		System.out.println("maxValue: " + maxValue);
	}
	public static void main(String[] args) {
	
		Student s = new Student();
		s.compute();
	}

}
