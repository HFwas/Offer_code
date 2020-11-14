package code4;

public class Exam5 {
	static int s;
	int i;
	int j;
	{
		int i = 1;
		i++;
		j++;
		s++;
	}
	public void test(int j) {
		i++;
		j++;
		s++;
	}
	public static void main(String[] args) {
		Exam5 exam1 = new Exam5();
		Exam5 exam2 = new Exam5();
		exam1.test(10);
		exam1.test(20);
		exam2.test(30);
		System.out.println(exam1.i + "," + exam1.j + "," + exam1.s);
		System.out.println(exam2.i + "," + exam2.j + "," + exam2.s);
	}
}
