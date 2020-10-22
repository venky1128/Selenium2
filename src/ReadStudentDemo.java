import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class ReadStudentDemo 
{
	public static void main(String[] args)throws Exception
	{
		
		FileInputStream fis= new FileInputStream("stud.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Object o= ois.readObject();
		Student s=null;
		if (o instanceof Student)
		{
			s=(Student)o;
			
	}
		System.out.println(s.firstName + " " + s.lastName + " " + s.dept + " " + s.roll + " " + s.phone + " "+ s.cgpa + " ");
		ois.close();
	} 
	

}
