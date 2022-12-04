package singleton;

public class EagerInitialization {
	
	private static final EagerInitialization obj= new EagerInitialization();
	
	private EagerInitialization() {}
	
	public static EagerInitialization getObj()
	{
		return obj;
	}

}
