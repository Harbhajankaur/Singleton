package singleton;

import java.io.Serializable;

public class Serialized implements Serializable{
	
	private static final long serialVersionUID = -7604766932017737115L;
	private Serialized() {}
	private static class SerializedHelper
	{
		private static final Serialized obj=new Serialized();
	}
	public static Serialized getObj()
	{
		return SerializedHelper.obj;
		
	}
}
