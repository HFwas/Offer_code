package step_code;

import org.junit.Test;

public class TestStep {
	//实现f(n):求n步台阶，一共有几种走法
	public int f(int n) {
		if (n == 1 || n == 2) {
			return n;
		}
		return f(n-1) + f(n-2);
	}
	
	@Test
	public void test() {
		long start = System.currentTimeMillis();
		System.out.println(f(40));//165580141
		long end = System.currentTimeMillis();
		System.out.println(end - start);//394ms
	}
}
