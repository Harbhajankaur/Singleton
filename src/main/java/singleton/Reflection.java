package singleton;

import java.lang.reflect.Constructor;

public class Reflection {

	public static void main(String args[])
	{
		EagerInitialization obj1=EagerInitialization.getObj();
		EagerInitialization obj2=null;
		
		try {
			Constructor[] constructors=EagerInitialization.class.getDeclaredConstructors();
			for (Constructor constructor : constructors)
			{
				 constructor.setAccessible(true);
				 obj2=(EagerInitialization) constructor.newInstance();
				 break;
			}
		}catch (Exception e) {
            e.printStackTrace();
		}
		 System.out.println(obj1.hashCode());
	        System.out.println(obj2.hashCode());
	}
}
