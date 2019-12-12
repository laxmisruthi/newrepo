package collection;

import java.util.HashMap;
import java.util.Map;

public class MapMultData {


	public static void main(String[] args) {
		Map<MEmployee,String> emp= new HashMap<MEmployee,String>();
		
		MEmployee emp1=new MEmployee();
		emp1.setId(1);
		emp1.setName("sruthi");
		emp1.setSalary(100000);
		
		emp.put(emp1, "empl1");
		
		MEmployee emp2=new MEmployee();
		emp2.setId(2);
		emp2.setName("laxmi");
		emp2.setSalary(600000);
		
		emp.put(emp2, "empl2");
		
		System.out.println(emp);
	}

}
