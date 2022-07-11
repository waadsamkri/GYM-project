
public class Member {
	
	static int idGenerator = 1000;
	
	private int id;
	private String name;
	private String gender;
	private String dob;
	private String dor;
	private String address;
	private String phone;
	private String type;
	
	public Member(String name, String gender, String dob, String dor, String address, String phone, String type) {
		idGenerator++;
		this.id = idGenerator; this.name = name; this.gender = gender; this.dob = dob;
		this.dor = dor; this.address = address; this.phone = phone; this.type = type;
	}
	
	public int getId() { return this.id; }
	public String getName() { return this.name; }
	public String getGender() { return this.gender; }
	public String getDob() { return this.dob; }
	public String getDor() { return this.dor; }
	public String getAddress() { return this.address; }
	public String getPhone() { return this.phone; }
	public String getType() { return this.type; }
	
	public String toString() {
		return String.format("ID No. %d\nName: %s\nGender: %s\nDate of Birth: %s\nDate of Registration: %s"
				+ "\nAddress: %s\nPhone No: %s\nMembership Type: %s", id, name, gender, dob, dor, address, phone, type);
	}
	
}
