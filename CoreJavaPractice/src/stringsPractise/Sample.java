package stringsPractise;

public class Sample {

	public static void main(String[] args) {
		String s1 = "sruthi";
		String s2 = new String("sruthi");

		if (s1.equals(s2)) {
			System.out.println("both string values has equal");
		}if(s1==s2){
			System.out.println("everything in string equal including address");
		}
	}

}
