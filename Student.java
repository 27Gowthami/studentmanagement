package student;

import java.lang.reflect.Array;
import java.util.*;

class Student {
	
	private int studentId;
	private String firstName;
	private String lastName;
	private String department;
	private float percentage;
	private String gender;
	
	private double studentFees;
	
	Student(int studentId,String firstName,String lastName,String department, float percentage, String gender,double studentFees){
		 this.studentId=  studentId;
         this.firstName = firstName;
         this.lastName = lastName;
         this.department = department;
         this.percentage =percentage;
         this.gender=gender;
        
         this.studentFees=studentFees;
	}
	public int getstudentId() {
		return studentId;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getdepartment() {
		return department;
	}
	public float getpercentage() {
		return percentage;
	}
	public String getgender() {
		return gender;
	}
	
	public double studentFees() {
		return studentFees;
	}
	
	public String toString() {
	return studentId +" "+firstName+" "+lastName+" "+department+" "+percentage+" "+gender+" "+studentFees;
	}
}
class teacher{
	private int teacherId;
	private String firstName;
	private String lastName;
	private String department;
	
	private String gender;
	
	private double salary;
	
	teacher(int teacherId,String firstName,String lastName,String department,  String gender,double salary){
		 this.teacherId=  teacherId;
         this.firstName = firstName;
         this.lastName = lastName;
         this.department = department;
         
         this.gender=gender;
        
         this.salary=salary;
	}
	public int teacherId() {
		return teacherId;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getdepartment() {
		return department;
	}
	
	
	public String getgender() {
		return gender;
	}
	
	public double studentFees() {
		return salary;
	}
	
	public String toString() {
	return teacherId +" "+firstName+" "+lastName+" "+department+"  "+gender+" "+salary;
	}
}

class CRUDDemo{
	

	

	

	private static  boolean found = false;

	public static void main(String[]args ) {

		Collection<Student> c=new ArrayList<Student>();
	Collection<teacher>t=new ArrayList<teacher>();
				
		Scanner s =new Scanner(System.in);
		Scanner s1 =new Scanner(System.in);
		int ch = 0;
		do {
			System.out.println("0.Exit");
			System.out.println("1.insert student record");
			System.out.println("2.view student record");
			System.out.println("3.search student record by studentId");
			
			System.out.println("4.Delete the StudentRecord:");
			System.out.println("5.insert Teacher Record :");
			System.out.println("6.View Teacher record :");
			System.out.println("7.Search Teacher record by teacherId:");
			System.out.println("8.Delete the TeacherRecord");
			System.out.println("9.Search Teacher Record By department");
			
			System.out.println("Enter your choice :");
			
			ch =s.nextInt();
			switch(ch) {
			case 0:
				System.out.println("No record is found ");
				System.exit(0);
			case 1:
				System.out.println("Enter studentId :");
			int	studentId = s.nextInt();
				
				System.out.println("Enter FirstName :");
			String	firstName=s1.next();
				
				System.out.println("Enter lastName :");
				
				
			String	lastName=s1.next();
				
				System.out.println(" Enter Department:");
			String	department =s.next();
				

				System.out.println("Enter percentage :");
		float		percentage =s.nextInt();
				
				System.out.println("Enter Gender :");
			String	gender =s1.next();
			
				
				System.out.println("Enter studentFees :");
		double		studentFees =s.nextInt();
		
		c.add( new Student( studentId,firstName, lastName,department, percentage, gender, studentFees));
				break;
				
			
			case 2:
				
				System.out.println("------------------------------------");
				Iterator<Student> i =c.iterator();
				while(i.hasNext()) {
					Student stu =i .next();
					System.out.println(stu);
				}
				System.out.println("------------------------------------");
				break;
			case 3:
				
					
						
						
						boolean found =false;
				System.out.println("Enter StudentId No to search :");
				studentId =s.nextInt();
				System.out.println("------------------------------------");
				 i =c.iterator();
				while(i.hasNext()) {
					Student stu =i .next();
					if(stu.getstudentId()==studentId) {
						System.out.println(stu);
						found=true;
						
					}
					System.out.println("------------------------------------");
					
					
				}
				
				if(!found) {
				System.out.println("Record is not Found");
				}
				break;
			case 4:
				boolean found2 =false;
				System.out.println("Enter StudentId No to Delete :");
				studentId =s.nextInt();
				System.out.println("------------------------------------");
				 i =c.iterator();
				while(i.hasNext()) {
					Student stu =i .next();
					if(stu.getstudentId()==studentId) {
						i.remove();
						found2=true;
						
					}
					System.out.println("Record is delete Successfully");
					System.out.println("------------------------------------");
					
					
				}
				
				if(!found2) {
				System.out.println("Record is not Found");
				}
				break;
			case 5:
				System.out.println("Enter TeacherId :");
				int	teacherId = s.nextInt();
					
					System.out.println("Enter FirstName :");
				String	firstName1=s1.next();
					
					System.out.println("Enter lastName :");
					
					
				String	lastName1=s1.next();
					
					System.out.println(" Enter Department:");
				String	department1 =s.next();
					

					
					
					System.out.println("Enter Gender :");
				String	gender1 =s1.next();
				
					
					System.out.println("Enter salary:");
			double		salary =s.nextInt();
			
			t.add( new teacher( teacherId,firstName1, lastName1,department1,  gender1, salary));
					break;
			case 6:
				System.out.println("------------------------------------");
				Iterator<teacher> i1 =t.iterator();
				while(i1.hasNext()) {
					teacher tec =i1 .next();
					System.out.println(tec);
				}
				System.out.println("------------------------------------");
				break;
			case 7:
				boolean found3 =false;
				System.out.println("Enter TeacherId No to search :");
				teacherId =s.nextInt();
				System.out.println("------------------------------------");
				 i1 =t.iterator();
				while(i1.hasNext()) {
			teacher tec =i1 .next();
					if(tec.teacherId()==teacherId) {
						System.out.println(tec);
						found3 =true;
						
					}
					System.out.println("------------------------------------");
					
					
				}
				
				if(!found3) {
				System.out.println("Record is not Found");
				}
				break;
				
			case 8:
				boolean found4 =false;
				System.out.println("Enter TeacherId No to delete:");
				teacherId =s.nextInt();
				System.out.println("------------------------------------");
				 i1 =t.iterator();
				while(i1.hasNext()) {
			teacher tec =i1 .next();
					if(tec.teacherId()==teacherId) {
						i1.remove();
						found4 =true;
						
					}
					System.out.println(" Record is Deleted Successfully");
					System.out.println("------------------------------------");
					
					
				}
				
				if(!found4) {
				System.out.println("Record is not Found");
				}
				break;
			
				
				
			}
		
			
			
	
		
		
		
			
		}while(ch!=0);
		
	}
}

		
			
		
			
	
			
			

