import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class GMS {

	private ArrayList<Member> members;
	private ArrayList<Class> classes;
	private ArrayList<Amenity> amenities;

	private Scanner stringInput;
	private Scanner intInput;

	public GMS() {
		members = new ArrayList<>();
		classes = new ArrayList<>();
		amenities = new ArrayList<>();
		stringInput = new Scanner(System.in);
		intInput = new Scanner(System.in);
	}

	public void printMenu() {
		System.out.println("-------------------- Main Menu -----------------------");
		System.out.println("1- Add a single member");
		System.out.println("2- Add a family member");
		System.out.println("3- Add a class");
		System.out.println("4- Add an amenity");
		System.out.println("5- Register a member in class");
		System.out.println("6- Print members list");
		System.out.println("7- Print classes");
		System.out.println("8- Print amenities");
		System.out.println("9- Print discount list");
		System.out.println("0- EXIT");
		System.out.println("-----------------------------");
		System.out.print("Please select an option: ");
	}

	public void addSingleMember() {
		System.out.println("\n---------- New Single Member Registration ------------");
		System.out.println("How many single members do you want to add? ");
                 int n=stringInput.nextInt();
	         for (int i = 0; i < n; i++) {
                 System.out.print("<< Single member #"+(i+1)+" >>");

		System.out.println("Enter the following data to add new single member");
		System.out.println("- Full Name: ");
		String name = stringInput.nextLine();
		System.out.println("- Gender: ");
		String gender = stringInput.nextLine();
		System.out.print("- Date of Birth (dd/mm/yyyy): ");
		String dob = stringInput.nextLine();
		System.out.print("- Date of Registration (dd/mm/yyyy): ");
		String dor = stringInput.nextLine();
		System.out.print("- Address: ");
		String address = stringInput.nextLine();
		System.out.print("- Phone No. (+9665xxxxxxxx): ");
		String phone = stringInput.nextLine();
		System.out.print("- Membership Type (VIP/Regular): ");
		String membership = stringInput.nextLine();
		members.add(new SingleMember(name, gender, dob, dor, address, phone, membership));
		System.out.println("------------------------------------------------------");
		System.out.println(
				"Single member successfully registered with ID No. " + members.get(members.size() - 1).getId());
		System.out.println("------------------------------------------------------");
	}
}
	public void addFamilyMember() {
		System.out.println("\n---------- New Family Member Registration ------------");
		System.out.println("Enter the following data to add new family member");
		System.out.print("- Full Name: ");
		String name = stringInput.nextLine();
		System.out.print("- Gender: ");
		String gender = stringInput.nextLine();
		System.out.print("- Date of Birth (dd/mm/yyyy): ");
		String dob = stringInput.nextLine();
		System.out.print("- Date of Registration (dd/mm/yyyy): ");
		String dor = stringInput.nextLine();
		System.out.print("- Address: ");
		String address = stringInput.nextLine();
		System.out.print("- Phone No. (+9665xxxxxxxx): ");
		String phone = stringInput.nextLine();
		System.out.print("- Membership Type (VIP/Regular): ");
		String membership = stringInput.nextLine();
		members.add(new FamilyMember(name, gender, dob, dor, address, phone, membership));
		System.out.println("------------------------------------------------------");
		System.out.println(
				"Family member successfully registered with ID No. " + members.get(members.size() - 1).getId());
		System.out.println("------------------------------------------------------");
	}

	public void addClass() {
		System.out.println("\n-------------- New Class Registration ----------------");
		System.out.println("Enter the following data to add new class");
		System.out.print("- Class Name: ");
		String name = stringInput.nextLine();
		System.out.print("- Class Capacity: ");
		int capacity = intInput.nextInt();
		System.out.print("- Class Instructor: ");
		String instructor = stringInput.nextLine();
		classes.add(new Class(name, true, capacity, instructor));
		System.out.println("------------------------------------------------------");
		System.out.println("Class added successfully.");
		System.out.println("------------------------------------------------------");
	}

	public void addAmenity() {
		System.out.println("\n------------- New Amenity Registration ---------------");
		System.out.println("Enter the following data to add new amenity");
		System.out.print("- Amenity Name: ");
		String name = stringInput.nextLine();
		System.out.print("- Amenity Instructor: ");
		String instructor = stringInput.nextLine();
		amenities.add(new Amenity(name, true, instructor));
		System.out.println("------------------------------------------------------");
		System.out.println("Amenity added successfully.");
		System.out.println("------------------------------------------------------");
	}

	public void classRegister() {
		System.out.println("\n--------------- Classes Registration -----------------");
		System.out.println("In which class you want to register ?");
		for (int i = 0; i < classes.size(); i++)
			System.out.printf("( %d ) %s\n", i + 1, classes.get(i).getName());
		System.out.print("Enter class number: ");
		int cNumber = intInput.nextInt() - 1;

		System.out.println("```````````````````````````````````");
		System.out.println("Which member you want to register ?");
		for (int i = 0; i < members.size(); i++)
			System.out.printf("( %d )  %d  -  %s\n", i + 1, members.get(i).getId(), members.get(i).getName());
		System.out.print("Choose member: ");
		int mNumber = intInput.nextInt() - 1;
		System.out.println("```````````````````````````````````");
		if (classes.get(cNumber).isFull())
			System.out.println("Sorry !! Class is FULL !!");
		else {
			classes.get(cNumber).register(members.get(mNumber));
			System.out.println("Member registered in class successfully.");
		}

		System.out.println("------------------------------------------------------");
	}

	public void printMembers() {
		System.out.println("\n---------------- Print Members List ------------------");
		for (Member m : members) {
			System.out.println(m.toString());
			System.out.println("``````````````````````````````");
		}
		System.out.println("------------------------------------------------------");
	}

	public void printClasses() {
		System.out.println("\n------------------- Classes List ---------------------");
		for (Class c : classes) {
			System.out.println("- Class Details:");
			System.out.println(c.toString());
			System.out.println("- Registered Members:");
			c.printRegistered();
			System.out.println("```````````````````````````````````");
		}
		System.out.println("------------------------------------------------------");
	}

	public void printAmenities() {
		System.out.println("\n------------------ Amenities List --------------------");
		for (Amenity a : amenities) {
			System.out.println("- Amenity Details:");
			System.out.println(a.toString());
			System.out.println("```````````````````````````````````");
		}
		System.out.println("------------------------------------------------------");
	}

	public void printDiscountList() throws Exception {
		System.out.println("\n------------------- Discount List --------------------");
		for(Member m : members) {
			if(m.getType().equals("VIP") || m.getType().equals("Vip") || m.getType().equals("vip"))
				System.out.printf("- %d\t%s\tDiscount Type: VIP\n", m.getId(), m.getName());
			else if( isTen(m.getDor()) )
				System.out.printf("- %d\t%s\tDiscount Type: 10 Years\n", m.getId(), m.getName());
			else
				continue;
		}
		System.out.println("------------------------------------------------------");
	}

	public boolean isTen(String sDate) throws Exception {
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
		Date now = new Date();
		long t1 = date.getTime();
		long t2 = now.getTime();
		int duration = (int) ((t1 - t2) / (1000 * 60 * 60 * 24) / 365);
		if(duration >= 10) 
			return true;
		else
			return false;
	}

	public static void main(String[] args) throws Exception {
		System.out.println("__________ Welcome to Gym Management System __________\n");
		GMS app = new GMS();
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			app.printMenu();
			int option = sc.nextInt();
			switch (option) {
			case 1:
				app.addSingleMember();
				break;
			case 2:
				app.addFamilyMember();
				break;
			case 3:
				app.addClass();
				break;
			case 4:
				app.addAmenity();
				break;
			case 5:
				app.classRegister();
				break;
			case 6:
				app.printMembers();
				break;
			case 7:
				app.printClasses();
				break;
			case 8:
				app.printAmenities();
				break;
			case 9:
				app.printDiscountList();
				break;
			default:
				sc.close();
				run = false;
				break;
			}

        }     
		}

	}

