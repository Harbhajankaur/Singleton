package singleton;

public class BillPugh {

	private BillPugh() {}
	private static class BillPughHelper
	{
		private static final BillPugh OBJ=new BillPugh();
	}
	public static BillPugh getObj()
	{
		return BillPughHelper.OBJ;
	}
}
