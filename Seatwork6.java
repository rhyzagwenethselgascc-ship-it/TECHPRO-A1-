class Student {
	String name;

	void displayName() {
		System.out.println("Student Name: " + name);
	}
}

public class Seatwork6 {
	public static void main(String[] args) {
		Student s1 = null;

		if (s1 == null) {
			System.out.println("Error: Student object is not created");
		}
	}
}