import java.lang.reflect.Method;

public class Program {

	public static void main(String[] args) {
		
		Class prog = Programming.class;
		
		//Programming prog = new Programming();
		
		for(Method method : prog.getMethods()) {
			Status statusAnnotation = method.getAnnotation(Status.class);
			
			if(statusAnnotation != null)
			{
				System.out.println("Method Name : "+method.getName());
				System.out.println("Author : "+statusAnnotation.author());
				System.out.println("Progress status : "+statusAnnotation.progress());
				System.out.println("---------------------------------");
			}
		}
		

	}

}
