package hw;

public class Classroom {
	
	int id;
	String name;
	
	public Classroom()
	{
		
	}
	
	public Classroom(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Classroom [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	

}
