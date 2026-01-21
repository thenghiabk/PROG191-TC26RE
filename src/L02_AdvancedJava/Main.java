package L02_AdvancedJava;

class User {
	// attributes
	private String name;
	private String tel;
	private String role;

	// constructors
	public User(String name, String tel, String role){
		this.name = name;
		this.tel = tel;
		this.role = role;
	}

	// helpers
	public String getInfo(){
		return "Name: " + name.toUpperCase() + ", Tel: " + tel + ", Role: " + role;
	}

}

class Admin extends User {
	// attributes
	private String email;
	private double salary;

	// constructors
	public Admin(String name, String tel, String role, String email, double salary){
		super(name, tel, role);
		this.email = email;
		this.salary = salary;
	}

	// helpers
	@Override
	public String getInfo(){
		return super.getInfo() + ", Email: " + email + ", Salary: " + salary;
	}
}

public class Main {
	public static void main (String[] args) {

		User guest1 = new User("Lucy", "222",  "Guest");
		System.out.println(guest1.getInfo());

		Admin admin1 = new Admin("David", "111",  "Admin", "dav02@fpt.com", 5000);
		System.out.println(admin1.getInfo());






		// String[] names = new String[10];
		// String[] telephones = new String[10];
		// String[] emails = new String[10];
		// String[] roles = new String[10];
		// String[][] subjects = new String[10][3];
		//
		// // add a new user
		// names[0] = "John";
		// telephones[0] = "000";
		// emails[0] = "joh01@fpt.com";
		// roles[0] = "Teacher";
		// subjects[0][0] = "Math";
		// subjects[0][1] = "English";
		// subjects[0][2] = "Physic";
		//
		// // add a new user
		// names[1] = "David";
		// telephones[1] = "111";
		// emails[1] = "dav02@fpt.com";
		// roles[1] = "Admin";
		//
		// // add a new user
		// names[2] = "Lucy";
		// telephones[2] = "222";
		// roles[2] = "Guest";
		//
		// // add a new user
		// names[3] = "Ben";
		// telephones[3] = "333";
		// emails[3] = "ben03@fpt.edu.vn";
		// roles[3] = "Student";
		// subjects[3][0] = "Math";
		// subjects[3][1] = "English";
		// subjects[3][2] = "Physic";

	}
}
