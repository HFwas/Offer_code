package singleton;
/*		静态内部类形式适用于多线程
 * 在内部类被加载和初始化时，才去创建INSTANCE对象
 * 静态内部类不会随着外部类的加载和初始化而初始化，他是要单独去加载和初始化的
 * 因为在内部类加载和初始化时创建的，因此时线程安全的
 */
public class Singleton6 {
	private Singleton6() {
		
	}
	private static class Inner{
		private static final Singleton6 INSTANCE = new Singleton6();
	}
	
	public static Singleton6 getInstance() {
		return Inner.INSTANCE;
	}
}
