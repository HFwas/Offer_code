package code1;

import singleton.Singleton2;

public class TestSingleton2 {
	public static void main(String[] args) {
		Singleton2 s = Singleton2.INSTANCE;
		System.out.println(s);
	}
}
