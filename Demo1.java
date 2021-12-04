package SimplePrograms;

public class Demo1 {

	// In this class we are not creating any object, and 
	// writing simple function. Its called class method,
	// Class method should start with static.
	static void print() {
		System.out.println("\n\nInside print..");
	}
	
	static void primitives() {
		System.out.println("Inside primitives");
		
		int intHex = 0x0041; // 16 power 0 * 1 + 16 power 1 * 4
		System.out.println("intHex: " + intHex);
		
		//Binary
		int intBinary = 0b01000001; // Binary starts with 0b
		// for simplicity we can also write
		// int intBinary = 0b0100_0001;
		System.out.println("intBinary: " + intBinary);
		
		//Octal
		int intOctal = 0101; //Octal starts with only 0
		System.out.println("intOctal: " + intOctal);
	}
	
	public static void main(String[] args) {
		primitives();
	}

}
