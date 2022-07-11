
public class FamilyMember extends Member{
	
	private String membership;
	
	public FamilyMember(String name, String gender, String dof, String dor, String address,
			String phone, String type) {
		super(name, gender, dof, dor, address, phone, type);
		this.membership = "Family";
	}
	
	public String getMembership() { return this.membership; }
	
	public String toString() {
		return super.toString() + String.format("\nMembership Section: %s", membership);
	}
	
}
