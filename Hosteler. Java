package college_data;

public class Hosteller extends Student {
	int room_num;
	char bk_name;
	String room_type;
	
	public Hosteller(int std_id, String std_name, String dept, String gender, String category, double college_fee,
			int room_num, char bk_name, String room_type) {
		super(std_id, std_name, dept, gender, category, college_fee);
		this.room_num = room_num;
		this.bk_name = bk_name;
		this.room_type = room_type;
	}
	public Hosteller() {
		// TODO Auto-generated constructor stub
	}
	public int getRoom_num() {
		return room_num;
	}
	public void setRoom_num(int room_num) {
		this.room_num = room_num;
	}
	public char getBk_name() {
		return bk_name;
	}
	public void setBk_name(char bk_name) {
		this.bk_name = bk_name;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public double  totalvalue() {
	 	double total_fee = super.getCollege_fee();
	 	
	 	if(bk_name=='A' && room_type.equals("Normal")) {
	 		return total_fee +=60000;
	 	    }
	 	else if(bk_name=='A' && room_type.equals("AC"))	{
	 		return total_fee += 68000;
	 	}
		else if(bk_name=='B' &&room_type.equals("Normal")) {
	 		return total_fee +=50000;
	     	}
	 	  
	 	else if(bk_name=='B' && room_type.equals("AC")) {
	 		return total_fee +=55000;
	     	}
	 	
	    else if(bk_name=='c' && room_type.equals("Normal")) {
	 		return total_fee +=40000;
	     	
	    }
	    
	    else {
	    	return total_fee+=42500;
	    }
		
	}
	
	
	
	@Override
	public String toString() {
		return " student_id="
				+ std_id + ", student_name=" + std_name + ", dept=" + dept + ", gender=" + gender + ", category=" + category
				+ ", college_fee=" + college_fee +",room_num=" + room_num + ", bk_name=" + bk_name +
				", room_type=" + room_type +",\n Total_fee : " +totalvalue(); 
	}
	
	

}
