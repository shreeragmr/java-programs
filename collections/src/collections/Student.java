package collections;

import java.util.HashSet;
import java.util.Objects;

public class Student {

	private String name;
	private int rollNumber;
 
        public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public int getRollNumber() {
		return rollNumber;
	}
 
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	@Override
	public String toString() {
		return "name=" + name + ", rollNumber=" + rollNumber;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(name, rollNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollNumber == other.rollNumber;
	}
	public static void main(String[] args) {
		
		Student s1 = new Student("Tom",21);
		Student s2 = new Student("Bob",22);
		Student s3 = new Student("jerry",23);
		Student s4 = new Student("john",21);
		Student s5 = new Student("Tom",21);
		
		HashSet<Student> set = new HashSet<>();
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		System.out.println(set);
	}
}
