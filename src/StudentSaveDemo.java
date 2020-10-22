import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class StudentSaveDemo 
{
	public static void main(String[] args)throws Exception
	{
		Student s = new Student();
		s.firstName="Alexa";
		s.lastName="Amazon";
		s.dept="AI";
		s.roll=12345;
		s.phone=1234567890;
		s.cgpa=7.8;
		FileOutputStream fos= new FileOutputStream("stud.txt");
		ObjectOutputStream os= new ObjectOutputStream(fos);
		os.writeObject(s);
		System.out.println("Done");
		os.close();
	}
	

}
