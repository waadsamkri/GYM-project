
public class SingleMember extends Member{
	
	private String membership;
	
	public SingleMember(String name, String gender, String dof, String dor, String address,
			String phone, String type) {
		super(name, gender, dof, dor, address, phone, type);
		this.membership = "Single";
	}
	
	public String getMembership() { return this.membership; }
	
	@Override
	public String toString() {
		return super.toString() + String.format("\nMembership Section: %s", membership);
	}
	
}
