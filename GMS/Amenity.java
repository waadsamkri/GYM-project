
public class Amenity extends Services {
	
	private String name;
	private boolean available;
	private String instructor;
	
	public Amenity(String name, boolean available, String instructor) {
		this.name = name;
		this.available = available;
		this.instructor = instructor;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return name;
	}
	
	@Override
	public void setAvailability(boolean available) {
		this.available = available;
	}
	
	@Override
	public boolean isAvailable() {
		return available;
	}

	@Override
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	@Override
	public String getInstructor() {
		return this.instructor;
	}
	
	@Override
	public String toString() {
		return String.format("Amenity Name: %s\nInstructor: %s", name, instructor);
	}
	
}
