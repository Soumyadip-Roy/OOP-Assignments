import java.util.*;

import java.io.*;

class Student {
	// attributes
	public String student_id, name, roll, Class, marks, address;

	Student(String id, String Name, String Roll, String class_, String Marks, String Address) {
		student_id = id;
		name = Name;
		roll = Roll;
		Class = class_;
		marks = Marks;
		address = Address;
	}

	public String getData() {
		return student_id + "," + name + "," + roll + "," + Class + "," + marks + "," + address;
	}
}

public class FileHandling {

	public static String filename = "database.txt";

	static Scanner sc = new Scanner(System.in);

	// methods

	public static void addStudent() {

		// entering student's details

		System.out.print("Enter student ID : ");
		String id = sc.next();
		System.out.print("Enter name : ");
		String enter = sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Enter roll number : ");
		String roll = sc.next();
		System.out.print("Enter class : ");
		String Class = sc.next();
		System.out.print("Enter marks: ");
		String marks = sc.next();
		System.out.print("Enter address : ");
		enter = sc.nextLine();
		String address = sc.next();
		Student student = new Student(id, name, roll, Class, marks, address);

		// writing to file
		try {
			FileWriter writer = new FileWriter(filename, true);
			writer.append(student.getData());
			writer.append("\n");
			writer.close();
			System.out.println("Student record added succefully!");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public static void deleteRecord(ArrayList<String> arr) {
		System.out.println("Enter - Student ID / roll number : ");
		String key = sc.next();
		String line;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			while ((line = reader.readLine()) != null) {
				if (line.contains(key)) {
					System.out.println(line + " Deleted !");// this line is not added to arraylist
					continue;
				} else {
					arr.add(line);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// overwriting the existing file
		try {
			FileWriter writer = new FileWriter(filename);
			for (int i = 0; i < arr.size(); i++) {
				writer.append(arr.get(i));
				writer.append("\n");
			}
			writer.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void updateRecord(ArrayList<String> arr) {

		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			System.out.println("Enter - Name / Student ID / roll number / Marks :");
			String key = sc.next();
			String line;

			while ((line = reader.readLine()) != null) {
				if (line.contains(key)) {

					String oldValue = key;
					System.out.println("Enter the new value : ");
					String newValue = sc.next();
					arr.add(line.replace(oldValue, newValue));
				} else {
					arr.add(line);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		// overwriting the existing file
		try {
			FileWriter writer = new FileWriter(filename);
			for (int i = 0; i < arr.size(); i++) {
				writer.append(arr.get(i));
				writer.append("\n");
			}
			writer.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// search record
	public static void searchStudent() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			System.out.println("Enter - Name / Student ID / roll number / Marks :");
			String key = sc.next();
			String line;
			while ((line = reader.readLine()) != null) {
				if (line.contains(key)) {
					System.out.println(line);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// display records
	public static void displayDatabase() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));

			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// psvm

	public static void main(String[] args) {

		// creating a file

		System.out.println("1 - Create File \n2 - Operations");
		

		while (true) {
			System.out.print("\nEnter your choice : ");
			int x = sc.nextInt();
			if (x == 1) {
				File database = new File(filename);
				try {
					if (database.createNewFile()) {
						try {
							FileWriter writer = new FileWriter(filename, true);
							writer.append("Student ID" + "," + "Name" + "," + "Roll No" + "," + "Class" + "," + "Marks"
									+ "," + "Address");
							writer.append("\n");
							writer.close();
							System.out.println("file "+filename+" created succefully!");
						} catch (IOException e) {
							System.out.println(e);
						}
					} else {
						System.out.println("File already exists");
						break;
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (x == 2) {
				// database operations
				System.out.println("1 - Add New Student Record");
				System.out.println("2 - Display all Records");
				System.out.println("3 - Delete Student Record");
				System.out.println("4 - Update Student Record");

				System.out.println("0 - EXIT");
				
				boolean cnd = true;
				while (cnd) {
					ArrayList<String> arr = new ArrayList<String>();

					
					System.out.print("\nEnter your choice : ");
					int p = sc.nextInt();
					
					switch (p) {
					case 0:
						cnd = false;
						break;
					case 1:
						addStudent();
						break;
					case 2:
						displayDatabase();
						break;
					case 3:
						deleteRecord(arr);
						break;
					case 4:
						updateRecord(arr);
						break;
					case 5:
						searchStudent();
						break;
					default:
						System.out.println("Invaild Choice!");
						break;
					}
				}
			}
		}
	}
}

//OUTPUT

//1 - Create File 
//2 - Operations
//
//Enter your choice : 1
//file database.txt created succefully!
//
//Enter your choice : 2
//1 - Add New Student Record
//2 - Display all Records
//3 - Delete Student Record
//4 - Update Student Record
//0 - EXIT
//
//Enter your choice : 1
//Enter student ID : 21286
//Enter name : Soumyadip Roy
//Enter roll number : 4250
//Enter class : IT
//Enter marks: 100
//Enter address : 008SB
//Student record added succefully!
//
//Enter your choice : 1
//Enter student ID : 21269
//Enter name : Ritik Kumar
//Enter roll number : 4241
//Enter class : Mech
//Enter marks: 59
//Enter address : 302D
//Student record added succefully!
//
//Enter your choice : 2
//Student ID,Name,Roll No,Class,Marks,Address
//21286,Soumyadip Roy,4250,IT,100,008SB
//21269,Ritik Kumar,4241,Mech,59,302D
//
//Enter your choice : 4
//Enter - Name / Student ID / roll number / Marks :
//4250
//Enter the new value : 
//4251
//
//Enter your choice : 2
//Student ID,Name,Roll No,Class,Marks,Address
//21286,Soumyadip Roy,4251,IT,100,008SB
//21269,Ritik Kumar,4241,Mech,59,302D
//
//Enter your choice : 3
//Enter - Student ID / roll number : 
//21269
//21269,Ritik Kumar,4241,Mech,59,302D Deleted !
//
//Enter your choice : 2
//Student ID,Name,Roll No,Class,Marks,Address
//21286,Soumyadip Roy,4251,IT,100,008SB
//
//Enter your choice : 0
