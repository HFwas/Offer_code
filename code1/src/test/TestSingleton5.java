package test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import singleton.Singleton5;
/*
 * 适用于线程安全
 */
public class TestSingleton5 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Singleton5> c = new Callable<Singleton5>() {
			@Override
			public Singleton5 call() throws Exception {
				return Singleton5.getInstance();
			}
		};
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Singleton5> ex1 = es.submit(c);
		Future<Singleton5> ex2 = es.submit(c);
		
		Singleton5 s1 = ex1.get();
		Singleton5 s2 = ex2.get();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
	
		es.shutdown();
	}
}
