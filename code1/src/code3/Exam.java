package code3;

import java.util.Arrays;

/*
 * 方法的参数传递
 */
public class Exam {
	public static void main(String[] args) {
		int i = 1;
		String string = "hello";
		Integer aInteger = 200;
		int[] num = {1,2,3,4,5};
		MyDate my = new MyDate();
		
		exchange(i,string,aInteger,num,my);
		
		System.out.println("i= " + i);
		System.out.println("string= " + string);
		System.out.println("aInteger= " + aInteger);
		System.out.println("num= " + Arrays.toString(num));
		System.out.println("my.a= " + my.a);
	}
	
	public static void exchange(int j,String s,Integer a,int[] nums,MyDate my) {
		j += 1;
		s += "world";
		a += 1;
		nums[0] += 1;
		my.a += 1;
	}
}
class MyDate{
	int a = 10;
}
