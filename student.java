package college_data;

public abstract class Student {
	int std_id;
	String std_name;
	String dept;
	String gender;
	String category;
	double college_fee;
 
	 Student() {
		
	}
	
	Student(int std_id,String std_name,String dept,String gender,String category,double college_fee){super();
	this.std_id=std_id;
	this.std_name=std_name;
	this.dept=dept;
	this.gender=gender;
	this.category= category;
	this.college_fee=college_fee;
	
	
	}
	
	

	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getCollege_fee() {
		return college_fee;
	}
	public void setCollege_fee(double college_fee) {
		this.college_fee = college_fee;
	}

    public abstract double totalvalue();
	
}
