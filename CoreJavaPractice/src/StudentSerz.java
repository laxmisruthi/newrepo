import java.io.Serializable;

public class StudentSerz implements Serializable {
	private static final long serialversionUID = 129348938L;
	transient int SAge;
	static int b;
	String name;
	int age;

	public StudentSerz(int sAge, String name, int age) {
		super();
		SAge = sAge;
		this.name = name;
		this.age = age;
	}

}
