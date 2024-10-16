package member;

public class Member {

	private String Name;
	private int id;
	private int Salary;
	
	void show()
	{
		
	System.out.println("Name:" + Name + "\t Id:" + id + " \t Salary:" + Salary);
	}

	@Override
	public String toString() {
		return "Member [Name=" + Name + ", id=" + id + ", Salary=" + Salary + "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
	
}
