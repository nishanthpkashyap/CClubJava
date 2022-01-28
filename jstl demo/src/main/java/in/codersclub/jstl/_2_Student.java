package in.codersclub.jstl;

public class _2_Student 
{
	String name;
	int rollno;
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "name = " + name + "        rollno = " + rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
}
