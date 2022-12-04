package singleton;

public class LazyInitialization {

	private static LazyInitialization obj;
	private LazyInitialization() {}
	public static LazyInitialization getObj()
	{
		if(obj==null)
		{
			obj=new LazyInitialization();
		}
		return obj;
	}
}
