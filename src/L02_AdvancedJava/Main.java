package L02_AdvancedJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface IPerson {
	public String getInfo();
	public void sayHello(String name);
}

interface ISpecialist {
	public boolean hasCertificate();
}

class User implements IPerson {
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

	public String getRole(){
		return role;
	}

	public String getTel(){
		return tel;
	}

	public String getName () {
		return name;
	}

	public void sayHello(String name){
		System.out.println("Hello " + name + ". How are you?");
	}


}

class Admin extends User implements ISpecialist{
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


	@Override
	public boolean hasCertificate () {
		return false;
	}
}

class Teacher extends User {
	// attributes
	private String email;
	private String[] subjects = new String[2];

	// constructors
	public Teacher(String name, String tel, String role, String email, String subject1, String subject2){
		super(name, tel, role);
		this.email = email;
		this.subjects[0] = subject1;
		this.subjects[1] = subject2;
	}

	// helpers
	@Override
	public String getInfo(){
		return super.getInfo() + ", Email: " + email + ", Subject 1:" + subjects[0] + ", Subject 2: " + subjects[1];
	}
}

class Student extends User {
	// attributes
	private String email;
	private String[] subjects = new String[3];

	// constructors
	public Student(String name, String tel, String role, String email, String subject1, String subject2, String subject3){
		super(name, tel, role);
		this.email = email;
		this.subjects[0] = subject1;
		this.subjects[1] = subject2;
		this.subjects[2] = subject3;
	}

	// helpers
	@Override
	public String getInfo(){
		return super.getInfo() + ", Email: " + email + ", Subject 1:" + subjects[0] + ", Subject 2: " + subjects[1] + ", Subject 3: " + subjects[2];
	}
}

public class Main {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		List<User> users = new ArrayList<>();

		User guest1 = new User("Lucy", "222",  "Guest");
		System.out.println(guest1.getInfo());

		User admin1 = new Admin("David", "111",  "Admin", "dav02@fpt.com", 5000);
		System.out.println(admin1.getInfo());

		User teacher1 = new Teacher("John","000", "Teacher", "joh01@fpt.com", "Math", "English");
		System.out.println(teacher1.getInfo());

		User student1 = new Student("Ben", "333", "Student", "ben3@fpt.edu.vn", "Math", "English", "Physics");
		System.out.println(student1.getInfo());

		users.add(guest1);
		users.add(admin1);
		users.add(teacher1);
		users.add(student1);

		boolean isRunning = true;

		while(isRunning){
			System.out.println("==========================");
			System.out.println("1. Add a new user");
			System.out.println("2. View all users");
			System.out.println("3. View users by group");
			System.out.println("4. Delete a user");
			System.out.println("0. Exit");
			System.out.println("==========================");

			String userChoice = sc.nextLine();

			switch (userChoice){
				case "0": // Exit
					isRunning = false;
					break;
				case "1": // Add a new user
					System.out.println("Enter user's name: ");
					String name = sc.nextLine();
					System.out.println("Enter user's telephone: ");
					String tel = sc.nextLine();

					System.out.println("Choose a role (Guest/Admin/Teacher/Student");
					String role = sc.nextLine();

					User newUser = null;

					if (role.equals("Guest")){ // add a new guest
						newUser = new User(name, tel, role);
					} else if (role.equals("Admin")){ // add a new admin
						System.out.println("Enter user's email: ");
						String email = sc.nextLine();
						System.out.println("Enter user's salary: ");
						double salary = Double.parseDouble(sc.nextLine());
						newUser = new Admin(name, tel, role, email, salary);
					} else if (role.equals("Teacher")){ // add a new teacher
						System.out.println("Enter user's email: ");
						String email = sc.nextLine();
						System.out.println("Enter subject 1: ");
						String subject1 = sc.nextLine();
						System.out.println("Enter subject 2: ");
						String subject2 = sc.nextLine();
						newUser = new Teacher(name, tel, role, email, subject1, subject2);
					} else { // add a new student
						System.out.println("Enter user's email: ");
						String email = sc.nextLine();
						System.out.println("Enter subject 1: ");
						String subject1 = sc.nextLine();
						System.out.println("Enter subject 2: ");
						String subject2 = sc.nextLine();
						System.out.println("Enter subject 3: ");
						String subject3 = sc.nextLine();
						newUser = new Student(name, tel, role, email, subject1, subject2, subject3);
					}

					users.add(newUser);

					break;
				case "2": // View all users
					for (int i = 0; i < users.size(); i++){
						String userInfo = users.get(i).getInfo();
						System.out.println(userInfo);
					}
					break;
				case "3": // View users by group
					System.out.println("Enter a group (Guest/Admin/Teacher/Student) ");
					String roleToView = sc.nextLine();

					for (int i = 0; i < users.size(); i++){
						User u = users.get(i);
						if (u.getRole().equalsIgnoreCase(roleToView)){
							String userInfo = u.getInfo();
							System.out.println(userInfo);
						}
					}

					break;
				case "4": // Delete a user
					System.out.println("Enter user's phone number: ");
					String userToDelete = sc.nextLine();

					for (int i = 0; i < users.size(); i++){
						User u = users.get(i);
						if (u.getTel().equalsIgnoreCase(userToDelete)){
							users.remove(u);
							System.out.println("User `" + u.getName() + "` has been removed.");
							break;
						}
					}

					break;
			}
		}

		System.out.println("Goodbye!");
	}
}
