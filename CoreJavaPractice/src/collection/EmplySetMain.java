package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmplySetMain {

	public static void main(String[] args) {
		
		Set<EmplySetBean> set = new HashSet<EmplySetBean>();
		EmplySetBean e1 = new EmplySetBean();
		e1.setId(1);
		e1.setName("sruthi");
		e1.setSalary(234567);
		EmplySetBean e2 = new EmplySetBean();
		e2.setId(1);
		e2.setName("sruthi");
		e2.setSalary(234567);

		set.add(e1);
		set.add(e2);
		
		System.out.println("size of set: "+set.size());
		//System.out.println(set.contains(e1));
		
		if(e1.hashCode()==e2.hashCode()) {
			if(e1.equals(e2)) {
				System.out.println(e1.getId()+" "+e1.getName()+" "+e2.getName());
			}
		}
		else {
			System.out.println(e1.getId()+" "+e1.getName()+"\n"+e2.getId()+" "+e2.getName());
		}

	}

}
