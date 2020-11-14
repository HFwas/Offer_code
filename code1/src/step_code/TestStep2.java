package step_code;

import org.junit.Test;

public class TestStep2 {
	public int loop(int n) {
		if (n == 1 || n == 2) {
			return n;
		}
		
		int one = 2;//初始化为走到第二阶台阶的走法
		int two = 1;//初始化为走到第一节台阶的走法
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			//最后跨两步和跨一步的走法
			sum = one + two;
			two = one;
			one = sum;
		}
		return sum;
	}
	
	@Test
	public void test() {
		long start = System.currentTimeMillis();
		System.out.println(loop(40));//433494437
		long end = System.currentTimeMillis();
		System.out.println(end - start);//0ms
	}
}
