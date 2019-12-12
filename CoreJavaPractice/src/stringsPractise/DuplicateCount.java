package stringsPractise;

public class DuplicateCount {

	public static void main(String[] args) {
		String s = "AMARAVADHIS";
		int distinct = 0;

		for (int i = 0; i < s.length(); i++) {

			for (int j = 0; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {
					distinct++;

				}
			}
			System.out.println(s.charAt(i) + "--" + distinct);
			//if we want only duplicate character count
			String d = String.valueOf(s.charAt(i)).trim();
			s = s.replaceAll(d, "");
			distinct = 0;

		}
	}

}
