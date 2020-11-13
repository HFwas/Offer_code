package singleton;

/**
 * 饿汉式：
 * 	在类初始化时直接创建实例对象，不管你是否需要对象都会创建
 * (1)构造器私有化
 * (2)自行创建，并且用静态变量保存
 * (3)向外提供实例
 * (4)为了强调这是一个单例，用final修饰
 * @author Administrator
 *
 */
public class Singleton1 {
	public static final Singleton1 INSTANCE = new Singleton1();
	private Singleton1(){
		
	}
	
}
