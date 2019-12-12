package collection;

public class CollectnSrtStdnt {
	int rollno;
	String name, address;

	public CollectnSrtStdnt(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}

}
