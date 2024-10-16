package employees;

public class Developer {

	private String Name;
	private int id;
	private int salary;
	
	void show()
	{
		System.out.println("Name:" + Name + "\t id:" + id + "\t salary:" + salary);
		
	}

	@Override
	public String toString() {
		return "Developer [Name=" + Name + ", id=" + id + ", salary=" + salary + "]";
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
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
