package singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestSerialized {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		Serialized obj1=Serialized.getObj();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file1.ser"));
		out.writeObject(obj1);
		out.close();
		
		ObjectInput in=new ObjectInputStream(new FileInputStream("file1.ser"));
		Serialized obj2 =(Serialized) in.readObject();
		in.close();
		
		 System.out.println("Obj1 hashCode="+obj1.hashCode());
	     System.out.println("Obj2 hashCode="+obj2.hashCode());
	}

}
