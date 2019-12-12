package collection;

public class SortBasdOnId implements Comparable<SortBasdOnId> {
	private int id;
	private String name;
	private int salary;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public SortBasdOnId(int id, String name, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	@Override
	public String toString() {
		return "SortBasdOnId id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "\n";
	}

	@Override
	public int compareTo(SortBasdOnId o) {
		return this.id - o.id;
	}

}
