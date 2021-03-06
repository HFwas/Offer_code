package singleton;

import java.io.IOException;
import java.util.Properties;

public class Singleton3 {
	public static final Singleton3 INSTANCE;
	private String info;
	
	static{
		try {

			Properties properties  = new Properties();
			
			properties.load(Singleton3.class.getClassLoader().getResourceAsStream("singleton.properties"));
			
			INSTANCE = new Singleton3(properties.getProperty("info"));
		
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private Singleton3(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Singleton3 [info=" + info + "]";
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	
}
