import java.util.ArrayList;

public class Class extends Services {
	
	private String name;
	private boolean available;
	private int capacity;
	private String instructor;
	private ArrayList<Member> registered;
	
	public Class(String name, boolean available, int capacity, String instructor) {
		this.name = name;
		this.available = available;
		this.capacity = capacity;
		this.instructor = instructor;
		registered = new ArrayList<>();
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
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
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isFull() {
		if(registered.size() >= capacity)
			return true;
		else
			return false;
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
		return String.format("Class Name: %s\nCapacity: %d\nInstructor: %s", name, capacity, instructor);
	}
	
	public void register(Member newMember) {
		registered.add(newMember);
	}
	
	public void printRegistered() {
		for(Member r : registered) {
			System.out.println(r.getId() +  "   -   " + r.getName());
		}
	}
	
}