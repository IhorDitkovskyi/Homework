package coreHomework1;

public class Main {

	public static void main(String[] args) {
		System.out.println(dupa("Hello", "Hello"));

	}
	static int dupa(String str1, String str2) {
		int rez = 0;
		if (str1.length() < str2.length()) {
			rez = str1.length();
		} else {
			rez = str2.length();
		}

		for (int i = 0; i < rez; i++) {
			if (str1.codePointAt(i) != str2.codePointAt(i)) {
				return str1.codePointAt(i) - str2.codePointAt(i);
			}
		}
		return str1.length() - str2.length();
	}
}
