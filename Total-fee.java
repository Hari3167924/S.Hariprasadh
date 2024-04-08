package college_data;

import java.util.Scanner;

public class Total_fee extends Student {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
       System.out.println("Enter the student details");
       System.out.println("Student id : ");
       int std_id = scan.nextInt();
       System.out.println("Student name : ");
       String std_name = scan.nextLine();
       scan.nextLine();      
       System.out.println("Department : " );
       String dept = scan.nextLine();
       System.out.println("Gender : ");
       String gender = scan.nextLine();
       System.out.println("Category (Hosteller/Dayscholar): ");
       String category = scan.nextLine();
       System.out.println("college_FEE : ");
       double college_fee = scan.nextDouble();
       
       
       if(category.equals("Hosteller")) {
    	   System.out.println("Room_no : ");
    	   int room_no = scan.nextInt();
    	   System.out.println("Block name(A,B,C)");
    	   char bk_name = scan.next().charAt(0);
    	   scan.nextLine();
    	   System.out.println("Room type (AC/Normal) : ");
    	   String room_type = scan.nextLine();
    	 
    	   
    	   Student s1= new Hosteller(std_id,std_name,dept,gender,category,college_fee,room_no,bk_name,room_type); 
    	  System.out.println(s1); 
    	   
       }
       else if(category.equals("Dayscholar")) {
    	   System.out.println("BUS number : ");
    	   int bus_no = scan.nextInt();
    	   System.out.println("Distance");
    	   float distance = scan.nextFloat();  
    	 
    	   Student s2 = new Dayscholar(std_id,std_name,dept,gender,category,college_fee,bus_no,distance);
    	   System.out.println(s2);  
       }
       else {
    	   System.out.println("Invalid category");
       }
       
       
      scan.close();
			  
			
		}

	@Override
	public double totalvalue() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
