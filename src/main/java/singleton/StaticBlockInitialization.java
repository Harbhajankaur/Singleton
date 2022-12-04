package singleton;

public class StaticBlockInitialization {

	private static StaticBlockInitialization obj;
	private StaticBlockInitialization() {}
	static {
		try {
			obj=new StaticBlockInitialization();
		}catch(Exception e) {
			throw new RuntimeException("Exception Occurred!!");
		}
	}
	
	public static StaticBlockInitialization getObj()
	{
		return obj;
	}
}
