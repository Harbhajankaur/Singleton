package singleton;

public class ThreadSafe {

	private static ThreadSafe obj;
	private ThreadSafe() {}
	public static synchronized ThreadSafe getObj()
	{
		if(obj==null)
		{
			obj=new ThreadSafe();
		}
		return obj;
	}
	public static ThreadSafe getObjUsingDoubleLocking()
	{
		if(obj==null)
		{
			 synchronized(ThreadSafe.class)
			 {
				 if(obj==null)
					{
						obj=new ThreadSafe();
					}
					return obj;
			 }
		}
		return obj;
	}
}
