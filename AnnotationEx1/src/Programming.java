public class Programming {

	@Status(author = "Guido")
	public void python() {
		System.out.println("Hello from python");
	}
	
	@Status(author = "James", progress = 100)
	public void java() {
		System.out.println("Hello from java");
	}
	
	@Status(progress = 85)
	public void ada(){
		System.out.println("Hello from ada");
	}
	
}
