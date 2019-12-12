package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmployeeMapMain {

	public static void main(String[] args) {
		Map<Integer,EmployeeMap> employee=new HashMap<Integer,EmployeeMap>();
		
		EmployeeMap e1=new EmployeeMap(1,"sruthi",6000);
		EmployeeMap e2=new EmployeeMap(2,"laxmi",10000);
		
		employee.put(1,e1);
		employee.put(2, e2);
		
		Iterator itr=employee.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry records =(Map.Entry)itr.next();
			EmployeeMap j=(EmployeeMap)records.getValue();
			System.out.println(j.id+" "+j.name+" "+j.salary);
		}
			
		
		//employee.forEach((Intger,EmployeeMap)-> System.out::println);
		
	}

}
